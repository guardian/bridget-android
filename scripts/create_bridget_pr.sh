# Usage: `./update_bridget.sh
set -xe

BRANCH_NAME=update-bridget-classes

# Checkout app repo and create branch
cd ..
git clone https://github.com/guardian/android-news-app.git
cd android-news-app
git checkout -b $BRANCH_NAME

# Copy jar
mv -f ../bridget-android/library/build/libs/library.jar bridget/src/main/libs/bridget.jar

# Commit & push new bridget jar
git config --global user.name "GuardianAndroid"
git config --global user.email "guardian.android@gmail.com"
git commit bridget/src/main/libs/bridget.jar -m "Update to bridget.jar"
git push origin $BRANCH_NAME

# Create PR with latest jar commit
curl \
  -X POST \
  -H "Accept: application/vnd.github.v3+json" \
  https://api.github.com/repos/guardian/android-news-app/pulls \
  -u GuardianAndroid:$GUARDIANANDROID_PAT \
  -d '{"head":"'$BRANCH_NAME'","base":"main", "title":"Pull request to update Bridget", "body":"The Bridget definitions have been updated. See [here](https://github.com/guardian/android-news-app/blob/main/bridget/README.md#how-to-update-bridget-version) how to review and merge this PR."}'
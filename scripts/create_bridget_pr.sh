#!/bin/bash -xe
# Usage: `./create_bridget_pr.sh

BRANCH_NAME=update-bridget-classes

CURRENT_VERSION="$(git describe --tags --abbrev=0)"

# Commit & push new bridget jar
#git config --global credential.helper "/bin/bash ./credential-helper.sh"
git config --global user.name "GuardianAndroid"
git config --global user.password "$GUARDIANANDROID_PAT"
git config --global user.email "guardian.android@gmail.com"
git config --global credential.helper store

# Checkout app repo and create branch
cd ..
git clone https://github.com/guardian/android-news-app.git
cd android-news-app
git checkout -b $BRANCH_NAME

# Copy jar
mv -f ../bridget-android/library/build/libs/library.jar bridget/src/main/libs/bridget.jar

git commit bridget/src/main/libs/bridget.jar -m "Update to bridget version $CURRENT_VERSION"
git push origin $BRANCH_NAME

# Create PR with latest jar commit
curl \
  -X POST \
  -H "Accept: application/vnd.github.v3+json" \
  https://api.github.com/repos/guardian/android-news-app/pulls \
  -u GuardianAndroid:$GUARDIANANDROID_PAT \
  -d '{"head":"'$BRANCH_NAME'","base":"main", "title":"Update Bridget to version $CURRENT_VERSION", "body":"The Bridget models have been updated to version $CURRENT_VERSION. See [here](https://github.com/guardian/android-news-app/blob/main/bridget/README.md#how-to-update-bridget-version) how to review and merge this PR."}'

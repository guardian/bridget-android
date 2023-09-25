
Generate files:

```shell
thrift -out library/src/main/java/ -gen java:generated_annotations=undated library/src/main/thrift/native.thrift
```

Generate jar:
```shell
./gradlew :library:build
```

Generated jar - [`library.jar`](/library/build/libs/library.jar)

Copy to Android news app:
```shell
mv -f library/build/libs/library.jar ../android-news-app/bridget/src/main/libs/bridget.jar
```
Commit and create a PR
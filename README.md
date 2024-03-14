# Bridget for Android
Thrift definitions of the API for communication between the Android native app and apps-rendered 
webview content

## Introduction

Bridget is our system for communication between TypeScript running in a WebView and the Android
(or iOS) native code. Bridget uses Thrift to define the functions the WebView expects the native
layer to provide and to define the types of the parameters the WebView must use when calling those
functions. This avoids ad-hoc, untyped communication methods, e.g. special URLs or JavaScript
interfaces, which are error prone.

## Module structure

* Directory `src/main/thrift` contains Thrift definitions of types and services.
* Package `com.theguardian.bridget.thrift` contains Java classes generated from those definitions.

## Generated classes

The classes in `com.theguardian.bridget.thrift` are generated using this command:

```shell
thrift -out library/src/main/java/ -gen java:generated_annotations=undated library/src/main/thrift/native.thrift
```

These classes are automatically generated using a Github Action whenever Bridget is updated. A jar
with the updated classes is then added to the `android-news-app` repo in a pull request. See the 
[readme there](https://github.com/guardian/android-news-app/blob/main/bridget/README.md#how-to-update-bridget-version) for how to merge the PR.

### Manually updating Bridget version

1. Get the latest `native.thrift` and copy it to this project: https://github.com/guardian/bridget/blob/main/thrift/native.thrift -> https://github.com/guardian/bridget-android/blob/main/library/src/main/thrift/native.thrift
2. Add back the namespace header to thrift file `namespace java com.theguardian.bridget.thrift`
3. Append the Bridget version at bottom of the thrift file, e.g `const string BRIDGET_VERSION = "2.0.0"`
4. Run the thrift command: 
   ```shell
   thrift -out library/src/main/java/ -gen java:generated_annotations=undated library/src/main/thrift/native.thrift
   ```
    - Note: This will require you to install the thrift compiler. Homebrew can install the latest 
      version with `brew install thrift`

5. Generate a `jar` file by running the command at root of the project 
   ```shell
   ./gradlew :library:build
   ```
    - The generated jar will be located at `/library/build/libs/library.jar` 

6. Copy the generated jar to the Android news app repo:
   ```shell
   mv -f library/build/libs/library.jar ../android-news-app/bridget/src/main/libs/bridget.jar
   ```

7. Commit and create a PR

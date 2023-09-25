@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    api(libs.apache.thrift) {
//        // These modules are excluded because a version of them is included in Android libraries.
//        // If we don't explicitly exclude them in this way, the gradle will exclude them for us,
//        // but this produces warnings.
//        exclude(group = libs.commons.logging.get().group, module = libs.commons.logging.get().module.name)
//        exclude(group = libs.apache.httpClient.get().group, module = libs.apache.httpClient.get().module.name)
//        exclude(group = libs.apache.tomcat.annotations.get().group, module = libs.apache.tomcat.annotations.get().module.name)
//        exclude(group = libs.apache.tomcat.embed.get().group, module = libs.apache.tomcat.embed.get().module.name)
    }
    // Unlike the 0.15 release, the 0.17 gradle release of libthrift's POM file is missing
    // dependency information so we have to supply it here. Taken from
    // https://github.com/apache/thrift/blob/master/lib/java/gradle/environment.gradle and
    // https://github.com/apache/thrift/blob/f066d84ffb7fe2eb0dc3b7e7cd0d0417a1ae7963/lib/java/gradle.properties
    // TODO when next increasing thrift version check if POM file includes its dependencies again,
    //  then we won't have to include them below.
    api(libs.javax.annotationApi)
    api(libs.slf4j.api)
    api(libs.apache.httpClient)
}

//thrift -out library/src/main/java/ -gen java:generated_annotations=undated library/src/main/thrift/native.thrift
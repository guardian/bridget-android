@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(libs.apache.thrift)
    // Unlike the 0.15 release, the 0.17 gradle release of libthrift's POM file is missing
    // dependency information so we have to supply it here. Taken from
    // https://github.com/apache/thrift/blob/master/lib/java/gradle/environment.gradle and
    // https://github.com/apache/thrift/blob/f066d84ffb7fe2eb0dc3b7e7cd0d0417a1ae7963/lib/java/gradle.properties
    // TODO when next increasing thrift version check if POM file includes its dependencies again,
    //  then we won't have to include them below.
    implementation(libs.javax.annotationApi)
    implementation(libs.slf4j.api)
    implementation(libs.apache.httpClient)
}
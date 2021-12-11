plugins {
    java
}

buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
}

repositories {
    mavenCentral()
}

configure<JavaPluginExtension> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    testImplementation("junit:junit:4.13.1")
    testImplementation("com.tngtech.junit.dataprovider:junit4-dataprovider:2.6")
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.compilerArgs.addAll(listOf("-Xlint:all", "-Werror"))
        options.compilerArgs.addAll(listOf("-Xlint:-options"))
    }

    withType<Test> {
        ignoreFailures = true
    }
}

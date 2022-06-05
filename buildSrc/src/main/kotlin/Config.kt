object Config {

//    Java
    const val jvmTarget = "1.8"

//    Android versions
    const val minSdkVersion = 21
    const val targetSdkVersion = 31
    const val compileSdkVersion = 31
    const val applicationId = "dev.ciox.github"
    const val versionCode = 1
    const val versionName = "1.0.0"


//    Build Plugins
    const val gradlePlugin = "com.android.tools.build:gradle:${Versions.gradleVersion}"
    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradlePlugin}"
    const val navigationSafe = ""
    const val googleService = ""
    const val fabric = ""
    const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"

//    Gradle Plugins
    const val androidApplication = "com.android.application"
    const val hiltPlugin = "dagger.hilt.android.plugin"
    const val kotlin = "kotlin"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinExt = "android.extensions"
    const val kotlinApt = "kapt"
    const val javaLib = "java-library"
    const val androidLib = "com.android.library"
    const val navigationSafePlugin = "androidx.navigation.safeargs"
    const val navigationSafeKotlin = "androidx.navigation.safeargs.kotlin"
    const val playService = "com.google.gms.google-services"

    const val proguardOptimize = "proguard-android-optimize.txt"

    const val testRunner = "androidx.test.runner.AndroidJUnitRunner"

//    Build Types
    const val debug = "debug"
    const val release = "release"

    const val minifyDebug = false
    const val minifyRelease = false

    const val proguardDebug = "proguard-rules.pro"
    const val proguardRelease = "proguard-rules.pro"
}
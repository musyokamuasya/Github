plugins {
    id (Config.androidApplication)
    id (Config.kotlinAndroid)
    kotlin(Config.kotlinApt)
    id (Config.hiltPlugin)
    id (Config.navigationSafeKotlin)
}

android {
    compileSdkVersion(Config.compileSdkVersion)

    defaultConfig {
        applicationId = Config.applicationId
        minSdkVersion(Config.minSdkVersion)
        targetSdkVersion(Config.targetSdkVersion)
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = Config.testRunner
    }

    buildTypes {
        getByName(Config.release){
            isMinifyEnabled = Config.minifyRelease
            proguardFiles(
                getDefaultProguardFile(Config.proguardOptimize), Config.proguardRelease
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Config.jvmTarget
    }
}

dependencies {

    implementation (Libraries.ktxCore)
    implementation (Libraries.appCompat)
    implementation (Libraries.material)
    implementation (Libraries.constraintLayout)
    implementation(Libraries.hilt)
    kapt(Libraries.hiltCompiler)
    testImplementation (Libraries.jUnit)
    androidTestImplementation (Libraries.jUnitTestExt)
    androidTestImplementation (Libraries.espressoCore)
}
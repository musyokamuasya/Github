plugins {
    id (Config.androidLib)
    id (Config.kotlinAndroid)
}

android {
    compileSdkVersion(Config.compileSdkVersion)

    defaultConfig {
        minSdkVersion(Config.minSdkVersion)
        targetSdkVersion(Config.targetSdkVersion)
//        versionCode = Config.versionCode
//        versionName = "1.0"

        testInstrumentationRunner = Config.testRunner
//        consumerProguardFiles = "consumer-rules.pro"
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
    testImplementation (Libraries.jUnit)
    androidTestImplementation (Libraries.jUnitTestExt)
    androidTestImplementation (Libraries.espressoCore)
}
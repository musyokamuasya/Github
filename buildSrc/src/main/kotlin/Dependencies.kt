object Urls {
    const val fabric = "https://maven.fabric.io/public"
    const val stringRepository = "https://repo.spring.io/release"
    const val jboss = "https://repository.jboss.org/maven2"
}

object Libraries {
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val material =  "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val androidxCore = "androidx.core:core:${Versions.coreVersion}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.coreVersion}"
    const val coreRole = "androidx.core:core-role:${Versions.coreRole}"
    const val coreAnimation = "androidx.core:core-animation:${Versions.coreAnimation}"
    const val splashScreen = "androidx.core:core-splashscreen:${Versions.splashScreen}"
    const val dataStore = "androidx.datastore:datastore-preferences-core:${Versions.dataStore}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val metrics = "androidx.metrics:metrics-performance:${Versions.metrics}"
    const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val navigationCompose = "androidx.navigation:navigation-compose:${Versions.navigation}"
    const val navigationModulesSupport = "androidx.navigation:navigation-dynamic-features-fragment:${Versions.navigation}"
    const val pagingRuntime = "androidx.paging:paging-runtime:${Versions.paging}"
    const val pagingCompose = "androidx.paging:paging-compose:${Versions.pagingCompose}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    const val recyclerviewSelection = "androidx.recyclerview:recyclerview-selection:${Versions.recyclerviewSelection}"
    const val securityCrypto = "androidx.security:security-crypto:${Versions.securityCrypto}"
    const val securityIdentity = "androidx.security:security-identity-credential:${Versions.identityCredentials}"
    const val appAuthenticator = "androidx.security:security-app-authenticator:${Versions.appAuthenticator}"
    const val swipeRefresh = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefresh}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coilImageLoader = "io.coil-kt:coil:${Versions.coilImageLoader}"

//    Retrofit
    const val retrofitRuntime = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val retrofitMock = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit}"
    const val retrofitAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val okLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okLogging}"

//    Lifecycle
    const val lifeacycleViewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle_version}"
    const val viewmodelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycle_version}"
    const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle_version}"
    const val livecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_version}"
    const val savedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycle_version}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle_version}"
    const val lifecyleCommon = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle_version}"
    const val lifecyleService = "androidx.lifecycle:lifecycle-service:${Versions.lifecycle_version}"
    const val lifecycleProcess = "androidx.lifecycle:lifecycle-process:${Versions.lifecycle_version}"
    const val reactiveStreams = "androidx.lifecycle:lifecycle-reactivestreams-ktx:${Versions.lifecycle_version}"

    //    Room
    const val roomRuntime = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"
    const val roomPaging = "androidx.room:room-paging:${Versions.paging}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.roomVersion}"

    //Logging
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    //    Testing
    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val jUnitTestExt = "androidx.test.ext:junit:${Versions.jUnitTestExt}"
    const val roomTesting = "androidx.room:room-testing:${Versions.roomVersion}"
    const val coreAnimationTesting = "androidx.core:core-animation-testing:${Versions.animationTesting}"
    const val achTesting = "androidx.arch.core:core-testing:${Versions.arch_version}"
    const val fragmentTesting = "androidx.fragment:fragment-testing:${Versions.fragment}"
    const val navigationTesting = "androidx.navigation:navigation-testing:${Versions.navigation}"
    const val kotlinTest = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlinVersion}"
    const val kotlinAllopen = "org.jetbrains.kotlin:kotlin-allopen:${Versions.kotlinVersion}"

    // Espresso
    const val espressoContrib = "androidx.test.espresso:espresso-contrib:${Versions.espresso}"
    const val espressoIntents = "androidx.test.espresso:espresso-intents:${Versions.espresso}"
    const val jUnitExtension = "androidx.test.ext:junit:${Versions.jUnitExtension}"
    const val uiautomator = "androidx.test.uiautomator:uiautomator:${Versions.uiautomator}"
    const val espressoCore =  "androidx.test.espresso:espresso-core:${Versions.espressoCore}"

    //Roboelectric
    const val roboelectric = "org.robolectric:robolectric:${Versions.robolectric}"

    // Firebase
    const val firebaseCore = "com.google.firebase:firebase-core:${Versions.firebaseCore}"
    const val firebaseAnalytics = "com.google.firebase:firebase-analytics:${Versions.firebaseAnalytics}"
    const val crashAnalytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashAnalytics}"
}
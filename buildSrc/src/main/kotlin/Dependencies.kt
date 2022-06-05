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

    //    Testing
    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val jUnitTestExt = "androidx.test.ext:junit:${Versions.jUnitTestExt}"
    const val espressoCore =  "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val roomTesting = "androidx.room:room-testing:${Versions.roomVersion}"
    const val coreAnimationTesting = "androidx.core:core-animation-testing:${Versions.animationTesting}"
    const val achTesting = "androidx.arch.core:core-testing:${Versions.arch_version}"
    const val fragmentTesting = "androidx.fragment:fragment-testing:${Versions.fragment}"

}
object Urls {
    const val fabric = "https://maven.fabric.io/public"
    const val stringRepository = "https://repo.spring.io/release"
    const val jboss = "https://repository.jboss.org/maven2"
}

object Libraries {
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktxCore}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val material =  "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

//    Testing
    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val jUnitTestExt = "androidx.test.ext:junit:${Versions.jUnitTestExt}"
    const val espressoCore =  "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}
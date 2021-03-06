// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://repo.spring.io/release")
        }
        maven {
            url = uri("https://repository.jboss.org/maven2")
        }
    }
    dependencies {
        classpath (Config.gradlePlugin)
        classpath (Config.kotlinPlugin)
        classpath(Config.hilt)
        classpath(Config.navigationSafe)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}


tasks.register("clean", Delete::class){
    delete(rootProject.buildDir)
}

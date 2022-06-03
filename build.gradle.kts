buildscript {
    val kotlinVersion = "1.5.31"
    extra.set("kotlinVersion", kotlinVersion)

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.4")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.4.2")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }

    extra.apply {
        set("versionCode", 1)
        set("versionName", "1.0.0")
        set("applicationID", "com.applicationmvvm")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

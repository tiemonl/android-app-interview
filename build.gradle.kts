
buildscript {
    dependencies {
        classpath("de.mannodermaus.gradle.plugins:android-junit5:1.10.0.0")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.51")
    }
}

plugins {
    id("com.android.application") version "8.2.0" apply false
    id("com.android.library") version "8.2.0" apply false
    id("com.google.dagger.hilt.android") version "2.45" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id("de.mannodermaus.android-junit5") version "1.8.2.0" apply false
    id("com.google.devtools.ksp") version "1.9.22-1.0.17" apply false
}

tasks.register<Delete>("clean").configure {
    delete(rootProject.buildDir)
}
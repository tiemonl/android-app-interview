buildscript {
    dependencies {
        classpath(libs.android.junit5)
        classpath(libs.hilt.gradle.plugin)
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.hilt.android) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.parcelize) apply false
    alias(libs.plugins.android.junit5) apply false
    alias(libs.plugins.ksp) apply false
}

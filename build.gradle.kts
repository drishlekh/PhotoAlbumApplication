// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) version "8.3.1" apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) version "1.9.0" apply false
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false//version change was done in tutorial
}
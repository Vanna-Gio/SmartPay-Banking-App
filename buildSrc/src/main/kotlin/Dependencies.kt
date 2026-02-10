object Versions {
    // SDK Versions
    const val compileSdk = 36
    const val minSdk = 26
    const val targetSdk = 36
    
    // App Version
    const val versionCode = 1
    const val versionName = "1.0.0"
    
    // Kotlin
    const val kotlin = "2.0.21"
    
    // Core Android
    const val coreKtx = "1.12.0"
    const val lifecycleRuntimeKtx = "2.7.0"
    const val activityCompose = "1.8.2"
    
    // Compose
    const val composeBom = "2023.10.01"
    const val composeNavigation = "2.7.6"
    
    // Hilt
    const val hilt = "2.48.1"
    const val hiltNavigationCompose = "1.1.0"
    
    // Room
    const val room = "2.6.1"
    
    // Firebase
    const val firebaseBom = "32.7.0"
    
    // Coroutines
    const val coroutines = "1.7.3"
    
    // Security
    const val securityCrypto = "1.1.0-alpha06"
    const val biometric = "1.2.0-alpha05"
    
    // Testing
    const val junit = "4.13.2"
    const val junitExt = "1.1.5"
    const val espresso = "3.5.1"
    const val mockitoKotlin = "5.1.0"
    const val coroutinesTest = "1.7.3"
}

object Dependencies {
    // Core
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}"
    const val lifecycleViewmodelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycleRuntimeKtx}"
    
    // Compose
    const val composeBom = "androidx.compose:compose-bom:${Versions.composeBom}"
    const val composeUi = "androidx.compose.ui:ui"
    const val composeUiGraphics = "androidx.compose.ui:ui-graphics"
    const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val composeMaterial3 = "androidx.compose.material3:material3"
    const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
    const val navigationCompose = "androidx.navigation:navigation-compose:${Versions.composeNavigation}"
    
    // Hilt
    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}"
    
    // Room
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    
    // Firebase
    const val firebaseBom = "com.google.firebase:firebase-bom:${Versions.firebaseBom}"
    const val firebaseAuth = "com.google.firebase:firebase-auth-ktx"
    const val firebaseFirestore = "com.google.firebase:firebase-firestore-ktx"
    const val firebaseStorage = "com.google.firebase:firebase-storage-ktx"
    
    // Coroutines
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val coroutinesPlayServices = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.coroutines}"
    
    // Security
    const val securityCrypto = "androidx.security:security-crypto:${Versions.securityCrypto}"
    const val biometric = "androidx.biometric:biometric:${Versions.biometric}"
    
    // Testing
    const val junit = "junit:junit:${Versions.junit}"
    const val junitExt = "androidx.test.ext:junit:${Versions.junitExt}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val composeUiTestJunit4 = "androidx.compose.ui:ui-test-junit4"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling"
    const val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest"
    const val mockitoKotlin = "org.mockito.kotlin:mockito-kotlin:${Versions.mockitoKotlin}"
    const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutinesTest}"
}
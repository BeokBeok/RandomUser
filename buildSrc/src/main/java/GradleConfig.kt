object Version {
    const val KOTLIN = "1.4.10"
    const val HILT = "2.29.1-alpha"
}

object ProjectConfig {
    const val MAVEN_URL = "https://plugins.gradle.org/m2/"

    const val GRADLE = "com.android.tools.build:gradle:4.2.0-alpha16"
    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.KOTLIN}"
    const val ANDROID_JUNIT5 = "de.mannodermaus.gradle.plugins:android-junit5:1.6.2.0"
    const val HILT_ANDROID_GRADLE_PLUGIN =
        "com.google.dagger:hilt-android-gradle-plugin:${Version.HILT}"
    const val KTLINT_GRADLE = "org.jlleitschuh.gradle:ktlint-gradle:9.4.1"
}

object AndroidConfig {
    const val COMPILE_SDK = 30
    const val APP_ID = "com.beok.randomuser"
    const val MIN_SDK = 23
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0.0"
    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
}

object Dependencies {
    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:${Version.KOTLIN}"
    const val CORE_KTX = "androidx.core:core-ktx:1.3.0"
    const val MATERIAL = "com.google.android.material:material:1.1.0"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.0.1"
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.1"
}

object TestConfig {
    private const val JUNIT_VERSION = "5.7.0"

    const val JUNIT_JUPITER_API = "org.junit.jupiter:junit-jupiter-api:$JUNIT_VERSION"
    const val JUNIT_JUPITER_ENGINE = "org.junit.jupiter:junit-jupiter-engine:$JUNIT_VERSION"
    const val JUNIT_JUPITER_PARAMS = "org.junit.jupiter:junit-jupiter-params:$JUNIT_VERSION"
    const val ASSERTJ_CORE = "org.assertj:assertj-core:3.18.0"
    const val MOCKK = "io.mockk:mockk:1.10.2"
}

object NetworkConfig {
    private const val RETROFIT_VER = "2.9.0"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:$RETROFIT_VER"
    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:4.9.0"
    const val CONVERTER_MOSHI = "com.squareup.retrofit2:converter-moshi:$RETROFIT_VER"
}

object HiltConfig {
    private const val HILT_JETPACK_VER = "1.0.0-alpha02"

    const val HILT_ANDROID = "com.google.dagger:hilt-android:${Version.HILT}"
    const val HILT_ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:${Version.HILT}"

    const val HILT_LIFECYCLE_VM = "androidx.hilt:hilt-lifecycle-viewmodel:$HILT_JETPACK_VER"
    const val HILT_COMPILER = "androidx.hilt:hilt-compiler:$HILT_JETPACK_VER"
}

object ConverterConfig {
    private const val MOSHI_VER = "1.11.0"

    const val MOSHI_KOTLIN = "com.squareup.moshi:moshi-kotlin:$MOSHI_VER"
    const val MOSHI_KOTLIN_CODEGEN = "com.squareup.moshi:moshi-kotlin-codegen:$MOSHI_VER"
}

object LifecycleConfig {
    private const val LIFECYCLE_VER = "2.2.0"

    const val LIFECYCLE_EXT = "androidx.lifecycle:lifecycle-extensions:$LIFECYCLE_VER"
    const val LIFECYCLE_VIEWMODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:$LIFECYCLE_VER"
}

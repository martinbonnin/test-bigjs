import org.jetbrains.kotlin.gradle.plugin.KotlinJsCompilerType

plugins {
    id("org.jetbrains.kotlin.multiplatform").version("1.8.20")
}

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    js(KotlinJsCompilerType.IR) {
        nodejs()
    }

    sourceSets {
        findByName("commonMain")?.apply {
            dependencies {

            }
        }
        findByName("commonTest")?.apply {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test")
            }
        }
        findByName("jsMain")?.apply {
            dependencies {
                implementation(npm("big.js", "5.2.2"))
            }
        }
    }
}

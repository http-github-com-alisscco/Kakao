plugins {
    id("com.android.library")
    id("kotlin-android")
    id("org.jetbrains.dokka")
    id("com.github.ben-manes.versions") version Versions.gradle_versions
}

android {
    compileSdkVersion(30)

    defaultConfig {
        minSdkVersion(14)
        targetSdkVersion(30)
        versionCode(2)
        versionName(Versions.kakaoVersion)
    }

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
            res.srcDir("src/main/res")
        }
        getByName("test") {
            java.srcDir("src/test/kotlin")
        }
    }
}

dependencies {
    implementation(Libraries.kotlin_stdlib)
    implementation(Libraries.appcompat)
    implementation(Libraries.recyclerview)
    implementation(Libraries.viewpager2)
    implementation(Libraries.swiperefresh)
    implementation(Libraries.design)
    implementation(Libraries.espresso_core)
    implementation(Libraries.espresso_web)
    implementation(Libraries.espresso_intents)
    implementation(Libraries.espresso_contrib)
    dokkaHtmlPlugin(Libraries.dokka)
}

tasks.named("dependencyUpdates", com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask::class).configure {
    rejectVersionIf {
        val stableKeyword: Boolean = listOf("RELEASE", "FINAL", "GA").any { currentVersion.toUpperCase().contains(it) }
        val regex = "/^[0-9,.v-]+(-r)?$/".toRegex()
        !stableKeyword && !(regex.matches(currentVersion))
    }
}

tasks.dokkaGfm {
    moduleName.set("kakao")
    outputDirectory.set(File("$rootDir/docs"))
}
tasks.dokkaHtml.configure {
    moduleName.set("kakao")
    outputDirectory.set(File("$rootDir/html"))
}

afterEvaluate {
    Deployment.initialize(project)
}

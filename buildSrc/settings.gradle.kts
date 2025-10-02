/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

dependencyResolutionManagement {
    repositories.mavenCentral()
    versionCatalogs.create("lib") {
        version("kotlin", "2.2.20")
        version("shadow", "9.2.2")

        library("kotlin", "org.jetbrains.kotlin", "kotlin-gradle-plugin").versionRef("kotlin")
        library("shadow", "com.gradleup.shadow", "shadow-gradle-plugin").versionRef("shadow")
    }
}

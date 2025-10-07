/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    versionCatalogs.create("lib") {
        version("kotlin", "2.2.20")
        version("shadow", "9.2.2")
        version("resourceFactory", "1.3.1")
        version("runPaper", "3.0.0")
        version("paperWeight", "2.0.0-beta.19")

        library("kotlin", "org.jetbrains.kotlin", "kotlin-gradle-plugin").versionRef("kotlin")
        library("shadow", "com.gradleup.shadow", "shadow-gradle-plugin").versionRef("shadow")
        library("resourceFactory", "xyz.jpenilla.resource-factory-bukkit-convention", "xyz.jpenilla.resource-factory-bukkit-convention.gradle.plugin").versionRef("resourceFactory")
        library("runPaper", "xyz.jpenilla.run-paper", "xyz.jpenilla.run-paper.gradle.plugin").versionRef("runPaper")
        library("paperWeight", "io.papermc.paperweight.userdev", "io.papermc.paperweight.userdev.gradle.plugin").versionRef("paperWeight")
    }
}

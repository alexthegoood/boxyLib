/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
    org.jetbrains.kotlin.jvm
}

val javaVersion: Int = 21

kotlin {
    jvmToolchain(javaVersion)
    compilerOptions {
        languageVersion = KotlinVersion.KOTLIN_2_2
        apiVersion = KotlinVersion.KOTLIN_2_2
    }
}

tasks.kotlinSourcesJar

tasks.withType<AbstractArchiveTask>().configureEach {
    archiveBaseName = project.name
    archiveVersion = rootProject.version.toString()
    archiveClassifier = name
}

tasks.compileJava {
    options.encoding = Charsets.UTF_8.name()
    options.release = javaVersion
}

tasks.compileKotlin {
    compilerOptions.jvmTarget = JvmTarget.fromTarget(javaVersion.toString())
}

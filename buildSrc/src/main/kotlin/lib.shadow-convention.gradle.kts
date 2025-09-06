/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar.Companion.shadowJar

plugins {
    com.gradleup.shadow
}

tasks.shadowJar {
    archiveBaseName = "${rootProject.name}-${project.name}"
    archiveVersion = "${rootProject.version}"
    archiveClassifier = "shaded"
}

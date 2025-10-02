/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar.Companion.shadowJar
import gradle.kotlin.dsl.accessors._30bf93f98bd66cbbff05bf99e604665f.jar
import gradle.kotlin.dsl.accessors._30bf93f98bd66cbbff05bf99e604665f.kotlinSourcesJar

plugins {
    `maven-publish`
}

publishing {
    publications.create<MavenPublication>("publication") {
        groupId = rootProject.group.toString()
        artifactId = project.name
        version = rootProject.version.toString()

        val artifactTask =
            if (plugins.hasPlugin("com.gradleup.shadow")) tasks.shadowJar
            else tasks.jar
        artifact(artifactTask.get().archiveFile)
        artifact(tasks.kotlinSourcesJar.get().archiveFile) { classifier = "sources" }
    }
}

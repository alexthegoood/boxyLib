/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    `java-library`
    `maven-publish`
}

java.withSourcesJar()

val isShadow = project.pluginManager.hasPlugin("com.gradleup.shadow")

publishing {
    publications.create<MavenPublication>("shadow") {
        groupId = "${rootProject.group}"
        artifactId = "${rootProject.name}-${project.name}"
        version = "${rootProject.version}"

        if (isShadow) {
            artifact(project.tasks.named<ShadowJar>("shadowJar").get().archiveFile)
            artifact(tasks.named("sourcesJar"))
        } else {
            from(components["java"])
        }
    }
}

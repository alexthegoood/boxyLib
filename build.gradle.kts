/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

group = "io.github.alexthegoood"
version = "1.0.0"

tasks {
    wrapper {
        gradleVersion = "9.0.0"
        distributionType = Wrapper.DistributionType.ALL
    }
    withType<Jar> {
        enabled = false
    }
}

allprojects {

    repositories.mavenCentral()

    tasks.withType<Jar> {
        archiveBaseName = "${rootProject.name}-${project.name}"
        archiveVersion = "${rootProject.version}"
        archiveClassifier = "java"
    }

}
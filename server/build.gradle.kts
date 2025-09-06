/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

plugins {
    lib.`kotlin-convention`
    lib.`shadow-convention`
    lib.`publishing-convention`
    alias(libs.plugins.resources)
    alias(libs.plugins.server.run)
    alias(libs.plugins.server.paperweight)
}

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    paperweight.foliaDevBundle(libs.versions.server.version)
    api(project(":api"))
}

tasks.shadowJar {
    archiveClassifier = null
    val destination = "${rootProject.group}.boxylib"
    relocate(destination, destination)
}

bukkitPluginYaml {
    name = rootProject.name
    author = "alexthegoood"
    version = "${rootProject.version}"

    main = "${rootProject.group}.boxylib.BoxyLib"
    apiVersion = "1.21.8"
    foliaSupported = true
}

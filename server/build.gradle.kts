/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

plugins {
    lib.`kotlin-convention`
    lib.`shadow-convention`
    lib.`publishing-convention`
    id("xyz.jpenilla.resource-factory-bukkit-convention") version "1.3.0"
}

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    api(project(":api"))
    compileOnly("io.papermc.paper:paper-api:1.21.8-R0.1-SNAPSHOT")
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

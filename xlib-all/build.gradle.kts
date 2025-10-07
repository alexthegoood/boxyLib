/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

plugins {
    convention.project
    convention.publication
    convention.paper
    com.gradleup.shadow
    xyz.jpenilla.`resource-factory-bukkit-convention`
    xyz.jpenilla.`run-paper`
}

dependencies {
    api(project(":xlib-adventure"))
    api(project(":xlib-config"))
    api(project(":xlib-plugin"))
    api(project(":xlib-utils"))
}

bukkitPluginYaml {
    name = rootProject.name
    author = "alexthegoood"
    version = rootProject.version.toString()

    main = "${rootProject.group}.XLib"
    apiVersion = "1.21.8"
    foliaSupported = true
}

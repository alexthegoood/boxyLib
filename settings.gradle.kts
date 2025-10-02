/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

rootProject.name = "xlib"

dependencyResolutionManagement {
    repositories.mavenCentral()
    versionCatalogs.create("lib") {
        version("adventure", "4.24.0")
        version("resourceFactory", "1.3.1")
        version("runPaper", "3.0.0")
        version("server-apiVersion", "1.21.8")
        version("server-paperVersion", "1.21.8-R0.1-SNAPSHOT")
//        version("server-paperWeight", "2.0.0-beta.19")

        library("paperServer", "io.papermc.paper", "paper-api").versionRef("server-paperVersion")
        library("adventure-api", "net.kyori", "adventure-api").versionRef("adventure")
        library("adventure-text-minimessage", "net.kyori", "adventure-text-minimessage").versionRef("adventure")
        library("adventure-text-serializer-gson", "net.kyori", "adventure-text-serializer-gson").versionRef("adventure")
        library("adventure-text-serializer-legacy", "net.kyori", "adventure-text-serializer-legacy").versionRef("adventure")
        library("adventure-text-serializer-plain", "net.kyori", "adventure-text-serializer-plain").versionRef("adventure")

        plugin("resourceFactory", "xyz.jpenilla.resource-factory-bukkit-convention").versionRef("resourceFactory")
        plugin("runPaper", "xyz.jpenilla.run-paper").versionRef("runPaper")
//        plugin("server.paperWeight", "io.papermc.paperweight.userdev").versionRef("server.paperWeight")

        bundle("adventure", listOf(
            "adventure-api",
            "adventure-text-minimessage",
            "adventure-text-serializer-gson",
            "adventure-text-serializer-legacy",
            "adventure-text-serializer-plain",
        ))
    }
}

include(
    "xlib-adventure",
    "xlib-config",
    "xlib-plugin",
    "xlib-all",
)

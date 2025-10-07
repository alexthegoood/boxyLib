/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

rootProject.name = "xlib"

dependencyResolutionManagement {
    repositories.mavenCentral()
    versionCatalogs.create("lib") {
        version("adventure", "4.24.0")

        library("adventure-api", "net.kyori", "adventure-api").versionRef("adventure")
        library("adventure-text-minimessage", "net.kyori", "adventure-text-minimessage").versionRef("adventure")
        library("adventure-text-serializer-gson", "net.kyori", "adventure-text-serializer-gson").versionRef("adventure")
        library("adventure-text-serializer-legacy", "net.kyori", "adventure-text-serializer-legacy").versionRef("adventure")
        library("adventure-text-serializer-plain", "net.kyori", "adventure-text-serializer-plain").versionRef("adventure")

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
    "xlib-utils",
    "xlib-all",
)

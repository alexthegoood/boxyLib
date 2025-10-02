/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

plugins {
    convention.project
    convention.publication
}

repositories.maven("https://repo.papermc.io/repository/maven-public/")
dependencies.compileOnly(lib.paperServer)

/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(lib.kotlin)
    implementation(lib.shadow)
    implementation(lib.resourceFactory)
    implementation(lib.runPaper)
    implementation(lib.paperWeight)
}

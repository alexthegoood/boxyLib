/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

package io.github.alexthegoood.xlib.plugin

import org.bukkit.plugin.java.JavaPlugin

/**
 * Checks if the server works on Folia.
 *
 * @return True if the server work on Folia, otherwise false
 */
fun JavaPlugin.isFolia() : Boolean = runCatching {
    Class.forName("io.papermc.paper.threadedregions.scheduler.RegionScheduler")
}.isSuccess

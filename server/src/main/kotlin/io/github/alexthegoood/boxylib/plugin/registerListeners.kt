/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

package io.github.alexthegoood.boxylib.plugin

import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

/**
 * Simple registration of [Listener].
 *
 * @param listeners The [Listener] instances to register.
 */
fun JavaPlugin.registerListeners(
    vararg listeners: Listener
) {
    listeners.forEach { listener ->
        server.pluginManager.registerEvents(listener, this)
    }
}

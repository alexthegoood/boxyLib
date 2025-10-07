/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

package io.github.alexthegoood.xlib.utils

import org.bukkit.attribute.Attribute
import org.bukkit.entity.Player

fun Player.getHitboxHeight() : Float { player
    val playerHitboxHeight: Float = 1.7671875f
    val playerScaleAttribute: Float = player?.getAttribute(Attribute.SCALE)?.value?.toFloat() ?: 1.0f
    return playerHitboxHeight*playerScaleAttribute
}

/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

package io.github.alexthegoood.xlib.utils.player

import org.bukkit.attribute.Attribute
import org.bukkit.entity.Player

/**
 * Receiving the highest point of the player based on his [Attribute.SCALE].
 *
 * @return The highest point of the player hitbox.
 */
fun Player.getHitboxHeight() : Float {
    val playerHitboxHeight: Float = 1.7671875f
    val playerScaleAttribute: Float = player?.getAttribute(Attribute.SCALE)?.value?.toFloat() ?: 1.0f
    return playerHitboxHeight*playerScaleAttribute
}

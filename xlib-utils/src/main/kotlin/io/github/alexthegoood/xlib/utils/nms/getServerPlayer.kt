/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

package io.github.alexthegoood.xlib.utils.nms

import net.minecraft.server.level.ServerPlayer
import org.bukkit.entity.Player
import org.jetbrains.annotations.NotNull

/**
 * Receiving ServerPlayer of player
 *
 * @return [ServerPlayer]
 */
fun @receiver:NotNull Player.getServerPlayer() : ServerPlayer = player!!.javaClass.getMethod("getHandle").invoke(player) as ServerPlayer

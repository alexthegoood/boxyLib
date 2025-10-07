/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

package io.github.alexthegoood.xlib.utils.nms

import net.minecraft.network.Connection
import net.minecraft.server.level.ServerPlayer
import org.bukkit.entity.Player
import org.jetbrains.annotations.NotNull

/**
 * Receiving connection of player
 *
 * @return [Connection]
 */
fun @receiver:NotNull Player.getConnection() : Connection = player!!.getServerPlayer().connection.connection

/**
 * Receiving connection of [ServerPlayer]
 *
 * @return [Connection]
 */
fun @receiver:NotNull ServerPlayer.getConnection() : Connection = this.connection.connection
/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

package io.github.alexthegoood.boxylib.adventure

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage
import net.kyori.adventure.text.serializer.ComponentSerializer
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer
import net.kyori.adventure.text.serializer.json.JSONComponentSerializer
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer

/**
 * Represents various types of component serializers provided by the Adventure library.
 */
enum class Serializers(val serializer: ComponentSerializer<Component, *, String>) {
    PLAIN (PlainTextComponentSerializer.plainText()),
    LEGACY (LegacyComponentSerializer.legacyAmpersand()),
    MINI (MiniMessage.miniMessage()),
    JSON (JSONComponentSerializer.json()),
    GSON (GsonComponentSerializer.gson());

    operator fun invoke() : ComponentSerializer<Component, *, String> = serializer
}

private val DEFAULT_SERIALIZER = Serializers.PLAIN()

/**
 * Serializes this [Component] into a [String] using the provided serializer.
 *
 * @param serializer The serializer to use for the serialization. Defaults to [DEFAULT_SERIALIZER].
 * @return The serialized [String] representation of the component.
 */
fun Component.serialize(
    serializer: ComponentSerializer<Component, *, String> = DEFAULT_SERIALIZER
) : String = serializer.serialize(this)

/**
 * Deserializes this [String] into a [Component] using the provided serializer.
 *
 * @param serializer The serializer to use for the deserialization. Defaults to [DEFAULT_SERIALIZER].
 * @return The deserialized component.
 */
fun String.deserialize(
    serializer: ComponentSerializer<Component, *, String> = DEFAULT_SERIALIZER
) : Component = serializer.deserialize(this)
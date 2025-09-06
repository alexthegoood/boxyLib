/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

package io.github.alexthegoood.boxylib.adventure

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.ComponentLike

/**
 * Replaces all occurrences of a literal [literal] string within this component with a [String] [replace].
 *
 * @param literal The literal string to be replaced.
 * @param replace The replacement string.
 * @return A new component with all occurrences of the literal string replaced.
 */
fun Component.replaceLiteral(
    literal: String,
    replace: String
) : Component = replaceText { builder -> builder.matchLiteral(literal).replacement(replace) }

/**
 * Replaces all occurrences of a literal [literal] string within this component with a [ComponentLike] [replace].
 *
 * @param literal The literal string to be replaced.
 * @param replace The replacement component.
 * @return A new component with all occurrences of the literal string replaced.
 */
fun Component.replaceLiteral(
    literal: String,
    replace: ComponentLike
) : Component = replaceText { builder -> builder.matchLiteral(literal).replacement(replace) }
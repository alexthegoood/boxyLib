/*
 * Copyright 2025 alexthegoood. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

package io.github.alexthegoood.boxylib.adventure

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.ComponentLike
import java.util.regex.Pattern

/**
 * Replaces all occurrences of a regular expression [pattern] within this component with a [String] [replace].
 *
 * @param pattern The regular expression pattern to be replaced.
 * @param replace The replacement string.
 * @return A new component with all occurrences of the pattern replaced.
 */
fun Component.replacePattern(
    pattern: Pattern,
    replace: String
): Component = replaceText { builder -> builder.match(pattern).replacement(replace) }

/**
 * Replaces all occurrences of a regular expression [pattern] within this component with a [ComponentLike] [replace].
 *
 * @param pattern The regular expression pattern to be replaced.
 * @param replace The replacement component.
 * @return A new component with all occurrences of the pattern replaced.
 */
fun Component.replacePattern(
    pattern: Pattern,
    replace: ComponentLike
) : Component = replaceText { builder -> builder.match(pattern).replacement(replace) }

/**
 * Replaces all occurrences of a regular expression [pattern] string within this component with a [String] [replace].
 *
 * @param pattern The regular expression pattern string to be replaced.
 * @param replace The replacement string.
 * @return A new component with all occurrences of the pattern replaced.
 */
fun Component.replacePattern(
    pattern: String,
    replace: String
) : Component = replacePattern(pattern.toPattern(), replace)

/**
 * Replaces all occurrences of a regular expression [pattern] string within this component with a [ComponentLike] [replace].
 *
 * @param pattern The regular expression pattern string to be replaced.
 * @param replace The replacement component.
 * @return A new component with all occurrences of the pattern replaced.
 */
fun Component.replacePattern(
    pattern: String,
    replace: ComponentLike
): Component = replacePattern(pattern.toPattern(), replace)
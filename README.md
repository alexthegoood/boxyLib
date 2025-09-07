# BOXYLIB
A set of utilities for easy work with minecraft plugins, adventure components and other functions in the future.
<hr>

## Usage
1. Add repository:
    ```kotlin
    repositories {
        maven("https://jitpack.io")
    }
    ```

2. Add dependency:
    ```kotlin
    dependencies {
        implementation("com.github.alexthegoood.boxyLib:{artifact}:{version}")
    }
    ```
    or if you use a plugin
    ```kotlin
    dependencies {
        compileOnly("com.github.alexthegoood.boxyLib:{artifact}:{version}")
    }
    ```

### Artifacts:
<table>
    <tr><th>Module</th><th>Features</th></tr>
    <tr>
        <td><code>boxylib-api</code></td>
        <td>Utilities for working with Kyori Adventure Components.</td>
    </tr>
    <tr>
        <td><code>boxylib-server</code></td>
        <td>Utilities for easy work with Listener and so on.</td>
    </tr>
</table>
<hr>

## Functions & Examples

#### Functions
<table>
    <tr><th>Function</th><th>Description</th></tr>
    <tr>
        <td><code>JavaPlugin.registerListeners(Listener...)</code></td>
        <td>Simple Listeners registration in one method.</td>
    </tr>
    <tr>
        <td><code>JavaPlugin.isFolia()</code></td>
        <td>Checks if the server works on Folia.</td>
    </tr>
    <tr>
        <td><code>Component.replacePattern({String, Pattern}, {String, ComponentLike})</code></td>
        <td>Replaces pattern in the component to String or ComponentLike.</td>
    </tr>
    <tr>
        <td><code>Component.replaceLiteral(String, {String, ComponentLike})</code></td>
        <td>Replaces string with a String or ComponentLike.</td>
    </tr>
    <tr>
        <td>
            <code>Component.serialize(ComponentSerializer)</code><br>
            <code>String.deserialize(ComponentSerializer)</code><br>
        </td>
        <td>Component serialization to/from a string.</td>
    </tr>
</table>

#### Examples

<details>
    <summary>registerListeners</summary>

```kotlin
class ExamplePlugin : JavaPlugin() {
    override fun onEnable() {
        registerListeners(
            MyListener1(),
            MyListener2()
        )
    }
}

class MyListener1 : Listener { /* EventHandlers here */ }
class MyListener2 : Listener { /* EventHandlers here */ }
```
</details>

<details>
    <summary>isFolia</summary>

```kotlin
class ExamplePlugin : JavaPlugin() {
    override fun onEnable() {
        val foliaServer = isFolia() // True if the server work on Folia, otherwise false
    }
}
```
</details>

<details>
    <summary>replacePattern</summary>

```kotlin
fun myFunction() {
    var mycomponent = Component.text("This is #000000")
    mycomponent = mycomponent.replacePattern("#([0-9a-fA-F]{6})", "hex color") // Component.text("This is hex color")
}
```
</details>

<details>
    <summary>replaceLiteral</summary>

```kotlin
fun myFunction() {
    var mycomponent = Component.text("Hello world")
    mycomponent = mycomponent.replacePattern("world", "minecraft") // Component.text("Hello minecraft")
}
```
</details>

<details>
    <summary>serialization and deserialization</summary>

```kotlin
/*
You can use Serializers enum (Serializers.{PLAIN, LEGACY, MINI, GSON, JSON}).
Example: serialize(Serializers.MINI); deserialize(Serializers.JSON).
By default: Serializers.PLAIN
 */
fun mySerialization() {
    val mycomponent = Component.text("Hello world")
    val mystring = mycomponent.serialize() // "Hello world"
}

fun myDeserialization() {
    val mystring = "Hello world"
    val mycomponent = mystring.deserialize() // Component.text("Hello world")
}
```
</details>
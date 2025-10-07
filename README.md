<h1>Introducing XLIB!</h1>
XLIB simplifies plugin development for Minecraft for beginner developers using Kotlin. The library is designed so that developers don't have to worry about certain functions and can create and implement their ideas.

<h1>Installation</h1>

<h3>Choose the module you need</h3>
<h6>(You will need to install the XLIB plugin on your server or implement it in your plugin.)</h6>
<table>
    <tr><th>Module</th><th>Description</th></tr>
    <tr>
        <td><code>xlib-all</code></td>
        <td>Contains all the functions from the modules listed below.</td>
    </tr>
<tr>
        <td><code>xlib-adventure</code></td>
        <td>Contains functions for working with Kyori Adventure Components.</td>
    </tr>
    <tr>
        <td><code>xlib-config</code></td>
        <td>(COMING SOON) Contains functions for working with configurations.</td>
    </tr>
    <tr>
        <td><code>xlib-plugin</code></td>
        <td>Contains functions that interact with JavaPlugin.</td>
    </tr>
    <tr>
        <td><code>xlib-utils</code></td>
        <td>Contains utilities that can be useful in the development.</td>
    </tr>

</table>

<h3>Add to <code>build.gradle.kts</code></h3>

```kotlin
repositories {
    maven("https://jitpack.io")
}

// If you have installed the XLIB plugin on your server, use 'compileOnly'.
dependencies {
    implementation("com.github.alexthegoood.xlib:{module}:{version}")
}
```

Note: If you want to learn more about the functions and contents of the modules, check the source code.

<h1>Examples</h1>
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

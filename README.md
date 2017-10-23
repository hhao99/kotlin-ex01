# welcome to Kotlin exercies

## Hello World

hello.kt

package hello
fun greating(name: String) = "Hello $name"

fun main(args: Array<String>) {
    println(greating("World"))
}

compile:
kotlinc hello.kt -include-runtime -d hello.jar

run
kotlin hello.jar
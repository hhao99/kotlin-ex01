package hello
fun greating(name: String) = "Hello $name!"

fun main(args: Array<String>): Int {
    println(greating("World"))
}
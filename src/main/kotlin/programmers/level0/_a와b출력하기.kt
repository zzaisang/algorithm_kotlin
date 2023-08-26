package programmers.level0

fun main() {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    val c = (a + b)
    print("$a + $b = $c")
}

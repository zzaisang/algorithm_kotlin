package programmers.level0

fun main() {
    val s1 = readLine()!!

    s1.forEach {
        if (it.isUpperCase()) {
            print(it.lowercase())
        }else{
            print(it.uppercase())
        }
    }
}

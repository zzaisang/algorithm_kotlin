package programmers.level0

class `_문자열 곱하기` {
    fun solution1(my_string: String, k: Int): String {

        return StringBuilder().apply{
            for(i in 0 until k){
                append(my_string)
            }
        }.toString()
    }

    fun solution2(my_string: String, k: Int): String {
        return my_string.repeat(k)
    }
}

fun main() {
    `_문자열 곱하기`().run {
        println(solution1("abc", 3))
    }
}

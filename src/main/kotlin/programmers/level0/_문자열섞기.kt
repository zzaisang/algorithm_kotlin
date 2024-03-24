package programmers.level0

class _문자열섞기 {

    fun solution1(str1: String, str2: String): String {
        return StringBuilder().apply {
            for (i in str1.indices) {
                append(str1[i])
                append(str2[i])
            }
        }.toString()
    }

    fun solution2(str1: String, str2: String): String {
        return str1.zip(str2).joinToString("") { (a, b) -> "$a$b"}
    }
}

fun main() {

    _문자열섞기().run {
        println(solution2("aaaaa", "bbbbb"))
        assert("ababababab" == solution2("aaaaa", "bbbbb"))
    }
}

package programmers.level0

class _문자열겹쳐쓰기 {
    fun solution(my_string: String, overwrite_string: String, s: Int) =
        my_string.replaceRange(s, overwrite_string.length + s, overwrite_string)
}

fun main() {

    _문자열겹쳐쓰기().run {
        println(solution("He11oWor1d", "lloWorl", 2))
    }
}

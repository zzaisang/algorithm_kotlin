package programmers.level0

class _공배수 {
    fun solution(number: Int, n: Int, m: Int): Int {
        return if ((number % n == 0) && (number % m == 0)) 1 else 0
    }
}

fun main() {
    _공배수().run {
        solution(60, 2, 3).apply {
            println(this)
            assert(1 == this)
        }
        solution(55, 10, 5).apply {
            println(this)
            assert(0 == this)
        }
    }
}

package programmers.level0

class _두수의연산값비교하기 {

    fun solution1(a: Int, b: Int): Int {
        val plus = "$a$b".toInt()
        val times = 2 * a * b
        return if(plus == times) plus else maxOf(plus, times)
    }

    fun solution2(a: Int, b: Int): Int {
        return maxOf("$a$b".toInt(), 2 * a * b)
    }

}

fun main() {

    _두수의연산값비교하기().run {
        solution1(91, 2).run {
            println(this)
            assert(912 == this)
        }
    }
}

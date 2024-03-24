package programmers.level0

import kotlin.math.pow

class `_홀짝에 따라 다른 값 반환하기` {
    fun solution(n: Int): Int {
        var answer = 0
        if (n % 2 == 0) {
            for (i in 1..n) {
                if (i % 2 == 0) {
                    answer += (i * i)
                }
            }
        } else {
            for (i in 1..n) {
                if (i % 2 != 0) {
                    answer += i
                }
            }
        }
        return answer
    }

    fun solution2(n: Int): Int {
        return if (n % 2 != 0) (1..n step 2).sum()
        else (2..n step 2).sumOf { it.toDouble().pow(2.0) }.toInt()
    }

}


fun main() {
    `_홀짝에 따라 다른 값 반환하기`().run {
        solution(7).apply {
            assert(16 == this)
            println(this)
        }
        solution(10).apply {
            assert(220 == this)
            println(this)
        }
    }
}

package programmers.level0

class n의배수 {
    fun solution(num: Int, n: Int): Int {
        return if(num % n == 0) 1 else 0
    }
}

fun main(){
    n의배수().run {
        println(solution(98, 2).run { assert(1 == this) })
        println(solution(34, 3).run { assert(0 == this) })
    }
}

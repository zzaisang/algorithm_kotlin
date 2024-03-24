package programmers.level0


class _더크게합치기 {

    fun solution1(a: Int, b: Int): Int {
        return maxOf(Integer.parseInt(a.toString() + b.toString()), Integer.parseInt(b.toString() + a.toString()))
    }

    fun solution2(a: Int, b: Int): Int {
        return maxOf("$a$b".toInt(), "$b$a".toInt())
    }

}

fun main(){

    _더크게합치기().run {
        solution2(9, 91).run {
            println(this)
            assert(991 == this)
        }
    }
}

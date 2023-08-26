package leetcode.beginner

class _1480_Easy {

    fun runningSum(nums: IntArray): IntArray {
        val results = IntArray(nums.size)
        var sum = 0
        for ((index, num) in nums.withIndex()) {
            sum += num
            results[index] = sum
        }
        return results
    }
}


fun main() {

    val runningSum = _1480_Easy().runningSum(intArrayOf(1, 2, 3, 4))
    println(runningSum.contentToString())
}

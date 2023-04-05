/*
    Given an array of integers nums and an integer target, return 
    indices of the two numbers such that they add up to target.
    
    You may assume that each input would have exactly one solution, 
    and you may not use the same element twice.

    You can return the answer in any order.

    Follow-up: Can you come up with an algorithm that is less than 
    O(n^2) time complexity?
*/

fun main() {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var i = 0
        var remainder: Int
        var j = 0
        while (i < nums.size) {
            remainder = target - nums[i]
            j = nums.indexOf(remainder)
            if (j != -1 && j != i) {
                return (intArrayOf(i, j))
            }
            i++
        }
        return (intArrayOf(i, j))
    }

    // Memory Complexity: O(1)
    // Time Complexity: O(n^2)
}
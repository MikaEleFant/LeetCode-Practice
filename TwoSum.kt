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
        var x = 0
        var y = 1
        while (x < nums.size) {
            y = 1
            while (y < nums.size) {
                if ((nums[x] + nums[y] == target) && (x != y)) {
                    return (intArrayOf(x, y))
                }
                y++
            }
            x++
        }
        return (intArrayOf(x, y))
    }

    // Memory Complexity: O(1)
    // Time Complexity: O(n^2)
}
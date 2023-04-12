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
        var hashMap = HashMap<Int, Int>()
        var result = IntArray(2)
        for ((i, num) in nums.withIndex()) {
            var difference = target - num
            if (hashMap.containsKey(difference)) {
                result[0] = hashMap[difference]!!
                result[1] = i
                return result
            }
            hashMap[num] = i
        }
        return result
    }

    // Space Complexity: O(n)
    // Time Complexity: O(n)
}
/*
    Given an array of integers nums and an integer target, return 
    indices of the two numbers such that they add up to target.
    
    You may assume that each input would have exactly one solution, 
    and you may not use the same element twice.

    You can return the answer in any order.

    Follow-up: Can you come up with an algorithm that is less than 
    O(n^2) time complexity?
*/

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let hashMap = new Map();
    let result = [];
    for (let i = 0; i < nums.length; i++) {
        let difference = target - nums[i];
        if (hashMap.has(difference)) {
            result.push(hashMap.get(difference));
            result.push(i);
            return result;
        }
        hashMap.set(nums[i], i);
    };
    return result;
};

// Space Complexity: O(n)
// Time Complexity: O(n)
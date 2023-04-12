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
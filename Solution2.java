import java.util.*;
/*

Remove Duplicates from Sorted Array II
Instructions

Given an integer array nums sorted in non-decreasing order, remove duplicates in-place such that each unique element appears at most twice.

The relative order of elements must be preserved. Since the operation must be in-place, the resulting array is stored in the first part of nums.

Return k, the number of elements after removing extra duplicates.

Requirements
Modify nums in-place.
Use only O(1) extra space.
After processing, the first k elements of nums should contain the valid result.
Elements beyond index k - 1 are not important.
Example 1
Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Example 2
Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Constraints
1 <= nums.length <= 3 * 10^4
-10^4 <= nums[i] <= 10^4
nums is sorted in non-decreasing order.
}




*/
class Solution2 {
    int solve(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> cache =  new HashMap<>();
        for(int i:nums){
            cache.put(i, 0);
        }
        int index=0;
        for(int i=0; i<nums.size(); i++){
            cache.put(nums.get(i), cache.get(nums.get(i))+1);
            if(cache.get(nums.get(i))<3){
                nums.set(index++, nums.get(i));
            }
        }
        return index;
    }
}

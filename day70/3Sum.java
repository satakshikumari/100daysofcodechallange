/*
3Sum - LeetCode

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.


Code */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> a = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1])
            continue;
            int  lo= i+1;
            int hi= nums.length-1;
            while(lo<hi){
                if(nums[lo]+nums[hi]== -nums[i])
                {
                    a.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                    lo++;
                    hi--;
                    while(lo<hi && nums[lo]==nums[lo-1])
                    lo++;
                    while(lo<hi && nums[hi]==nums[hi+1])
                    hi--;

                }
                else if(nums[lo]nums[hi]> -nums[i]){
                    hi--;

                }
                else{
                    lo++;
                }
            }
        }
        return a;
        
    }
}

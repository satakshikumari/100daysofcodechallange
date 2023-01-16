/*

3Sum Closest - LeetCode

Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

Example 2:
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

Code-
*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff= Integer.MAX_VALUE;
       int ans= 0;
      for(int i=0;i<nums.length;i++)
      {
          int first= nums[i];
           int second= i+1;
           int end= nums.length-1;
           while(second<end){
             int sum= first + nums[second] + nums[end];
             int a= Math.abs(target- sum);
             if(a<diff){
                 diff=a;
                 ans = sum;
             }
             if(sum > target){
                 end--;
             }
             else if(sum<target){
                 second++;
             }
             else{
                 break;
             }


           }



      }
    
      return ans;
}
}

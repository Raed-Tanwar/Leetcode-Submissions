class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int maxSum=nums[0];
        int minSum=nums[0];
        int maxBestEnding=nums[0];
        int minBestEnding=nums[0];
        int totalSum=nums[0];
         
        for(int i=1;i<n;i++){
            maxBestEnding=Math.max(maxBestEnding+nums[i],nums[i]);
            minBestEnding=Math.min(minBestEnding+nums[i],nums[i]);
            maxSum=Math.max(maxBestEnding,maxSum);
            minSum=Math.min(minBestEnding,minSum);
            totalSum+=nums[i];

        }
        int normalmax=maxSum;
        int circularmax=totalSum-minSum;
   
        if(maxSum<0){
             return maxSum;

        }
        return Math.max(normalmax,circularmax);  
    }
}
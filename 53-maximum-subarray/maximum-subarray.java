class Solution {
    public int maxSubArray(int[] nums) {
        int bestend= nums[0];
        int ans= nums[0];

        for(int i=1; i<nums.length; i++){
            int x = bestend + nums[i];
            int y = nums[i];

            bestend = Math.max(x,y);
            ans = Math.max(ans, bestend);
        }
        return ans;
    }
}
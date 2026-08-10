class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;

        int minLength = Integer.MAX_VALUE;

        while (right < nums.length) {

            sum += nums[right];
            right++;

            while(sum >= target) {   
                minLength = Math.min(minLength, right - left);
                sum -= nums[left];
                left++;
            }
           
        }
         if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }
}
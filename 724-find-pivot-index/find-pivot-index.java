class Solution {
    public int pivotIndex(int[] nums) {
        int left =0;
        int right =0;
        int sum = 0;
        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
        }
        for(int i =0; i< nums.length; i++){
            if(i == 0) left =0;
            else left += nums[i-1];
            right = sum - nums[i] - left;
            if(left == right) return i;
        }
        return -1;
    }
}
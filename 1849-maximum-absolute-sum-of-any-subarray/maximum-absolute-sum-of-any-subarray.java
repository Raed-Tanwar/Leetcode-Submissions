class Solution {
    public int maxAbsoluteSum(int[] nums) {
      int maxsum = nums[0];
      int minsum = nums[0];
      int result = Math.abs(nums[0]);

      for(int i=1; i<nums.length; i++){
        int x = maxsum + nums[i];
        int y = minsum + nums[i];
        int z = nums[i];

        maxsum = Math.max(x, z);
        minsum = Math.min(y ,z);
        result = Math.max( result, Math.max( Math.abs(maxsum), Math.abs(minsum)));
      }  
      return result;
    }
}
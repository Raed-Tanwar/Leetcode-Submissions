class Solution {
    public int maxProduct(int[] nums) {
        int maxEnding = nums[0];
int minEnding = nums[0];
int result = nums[0];

for (int i = 1; i < nums.length; i++) {
int tempMax = Math.max(nums[i], Math.max(nums[i] * maxEnding, nums[i] * minEnding));
minEnding = Math.min(nums[i], Math.min(nums[i] * maxEnding, nums[i] * minEnding));

maxEnding = tempMax;

result = Math.max(result, maxEnding);
}
return result;
    }
}
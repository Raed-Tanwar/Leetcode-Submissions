import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> f = new HashMap<>();
        f.put(0, 1);
        int n = nums.length;
        int sum = 0;
        int res = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            int ques = sum - k;
            if(f.containsKey(ques)){
                res += f.get(ques);
            }
            f.put(sum, f.getOrDefault(sum, 0) + 1);
        }
        return res;
    }
}

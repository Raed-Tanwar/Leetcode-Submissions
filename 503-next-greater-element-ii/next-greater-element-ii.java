class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;

        for(int i=n-2; i>=0; i--){
            stack.push(nums[i]);
        }
        int[] res = new int[nums.length];

        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && nums[i]>=stack.peek()){
                stack.pop();
            }

            if(stack.isEmpty()){
                res[i] = -1;
            }
            else{
                res[i] = stack.peek();
            }
            stack.push(nums[i]);
        }
        return res;
    }
}
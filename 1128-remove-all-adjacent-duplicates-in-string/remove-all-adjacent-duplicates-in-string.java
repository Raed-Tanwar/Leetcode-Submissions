class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>stack = new Stack<>();
        char[] ch= s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(!stack.isEmpty() && stack.peek()==ch[i]){
                stack.pop();
            }else{
                stack.push(ch[i]);
            }
        }

    StringBuilder result = new StringBuilder();
        for(char c : stack){
            result.append(c);
        }
        return result.toString();
    }
}
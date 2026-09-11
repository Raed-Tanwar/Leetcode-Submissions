class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;

        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

        // this is when the string is in array
        //BUT IT CAN BE DONE USING 'STACK' WHERE THE STRING IS GIVEN IN STRING DATA TYPE: FIRST PUSH CHARARCTER ONE BY ONE THEN POP THEM AND RETURN THE RESULT
    }
}
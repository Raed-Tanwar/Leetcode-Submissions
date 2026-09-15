class Solution {
    // stack. char and int pair use to track the no. of time a char appears, sp o we can compare it with (k-1) when entering a stack to solve the problem
    static class Pair {
        char first;
        int second;

        Pair(char first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public String removeDuplicates(String s, int k) {
         int n = s.length();
        Stack<Pair> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (st.isEmpty()) {
                st.push(new Pair(c, 1));
                continue;
            }

            if (st.peek().first != c) {
                st.push(new Pair(c, 1));
                continue;
            }

            if (st.peek().second < (k - 1)) {
                Pair p = st.peek();
                st.pop();
                st.push(new Pair(p.first, p.second + 1));
                continue;
            }

            st.pop();
        }

        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            Pair p = st.peek();
            st.pop();
            
            while (p.second > 0) {
                res.append(p.first);
                p.second--;
            }
        }

        return res.reverse().toString();
    }
}
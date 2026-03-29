class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 != 0) return false;

        char[] stack = new char[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
            } else {
                if (top == -1) return false;

                char prev = stack[top--];

                if ((c == ')' && prev != '(') ||
                    (c == '}' && prev != '{') ||
                    (c == ']' && prev != '[')) {
                    return false;
                }
            }
        }

        return top == -1;
    }
}
class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0) return false;
        int n = s.length();

        char [] stack = new char[n];
        int top = -1;

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);

            if(c == '(' || c == '{' || c == '['){
                stack[++top] = c;
            }else{
                if(top == -1) return false;

                char pop = stack[top--];

                if(c == ')' && pop != '('||
                   c == '}' && pop != '{'||
                   c == ']' && pop != '['){
                    return false;
                }
            }
        }
        return top == -1;
    }
}
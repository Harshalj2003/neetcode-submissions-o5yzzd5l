class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='[')
                    st.push(s.charAt(i));
                else
                    return false;
            }
            else{
                if(s.charAt(i)==']'){
                    if(st.pop()!='[')
                        return false;
                }
                else if(s.charAt(i)=='}'){
                    if(st.pop()!='{')
                        return false;
                }
                else if(s.charAt(i)==')'){
                    if(st.pop()!='(')
                        return false;
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        if(!st.isEmpty())
            return false;
        return true;
    }
}

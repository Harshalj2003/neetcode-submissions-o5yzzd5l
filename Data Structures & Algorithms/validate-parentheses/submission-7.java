class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        HashMap<Character, Character> closeToOpen = new  HashMap<>();
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');
        closeToOpen.put(')', '(');

        for(char c : s.toCharArray()){
            if(closeToOpen.containsKey(c)){
                if(closeToOpen.get(c) == stack.peek()){
                    stack.pop();
                }else{
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
class Solution {
    public boolean isValid(String s) {
        if(s.length() <= 1) return false;
        Deque<Character> stack = new ArrayDeque<>();
        HashMap<Character, Character> closeToOpen = new  HashMap<>();
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');
        closeToOpen.put(')', '(');

        for(char c : s.toCharArray()){
            if(closeToOpen.containsKey(c)){
                if(stack.peek() == closeToOpen.get(c)){
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
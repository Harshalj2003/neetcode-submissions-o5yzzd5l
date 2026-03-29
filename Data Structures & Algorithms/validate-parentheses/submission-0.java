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
                try{
                    if(stack.peek() == closeToOpen.get(c)){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
                catch(EmptyStackException e){
                    System.out.println("EmptyStackException Occurred means: Stack is Empty");
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
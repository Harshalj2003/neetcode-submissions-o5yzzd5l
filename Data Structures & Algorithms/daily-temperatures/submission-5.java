public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr = new int[temperatures.length];
        Deque<int[]> stack = new ArrayDeque<>();

        for(int i = 0; i < temperatures.length; i++){
            int curr = temperatures[i];
            while(!stack.isEmpty() && curr > stack.peek()[0]){
                int [] temp = stack.pop();
                arr[temp[1]] = i - temp[1];
            }
            stack.push(new int[]{curr, i});
        }
        return arr;
    }
}
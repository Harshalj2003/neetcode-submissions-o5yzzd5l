class Solution {
    public int maxArea(int[] heights) { //height = [1,7,2,5,4,7,3,6]   = 36
        if(heights.length == 0) return 0;

        int i = 0;
        int j = heights.length-1;

        int max = 0;

        while(i < j){

            int currMax = (j - i) * Math.min(heights[i], heights[j]);

            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }

            max = Math.max(currMax, max);
        }
        return max;
    }
}

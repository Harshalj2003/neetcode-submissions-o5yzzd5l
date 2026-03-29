class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length < 1) return new int[0];
        int j = numbers.length-1;
        int i = 0;                       // target = 5
                                         //[-5,-3,0,2,4,6,8]    7
        while(i < j){                    //  i            j
            int sum = numbers[i] + numbers[j];

            if (sum == target){
                return new int[]{i+1,j+1};
            }

            if (sum < target){
                i++;
            }else{
                j--;
            }
        }
        return new int[0];
    }
}

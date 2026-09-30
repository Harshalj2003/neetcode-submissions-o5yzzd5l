class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length < 1) return new int[0];
        int j = 1;
        int i = 0;          // target = 11
                            //[1,5,9,10]    4
        while(i < j){       // i      j
            if(j < numbers.length && numbers[i] + numbers[j] != target){
                j++;
            }
            if(i < j && numbers[i] + numbers[j] != target){
                i++;
            }
            else{
                return new int[]{i+1, j+2};
            }
        }
        return new int[0];
    }
}

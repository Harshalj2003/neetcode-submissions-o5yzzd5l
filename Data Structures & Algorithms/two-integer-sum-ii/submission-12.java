class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length < 1) return new int[0];
        int j = 1;
        int i = 0;                       // target = 5
                                         //[-5,-3,0,2,4,6,8]    7
        while(j < numbers.length){       //  i      j
            if(numbers[i] + numbers[j] == target){
                return new int[]{i+1, j+1};
            }
            else if(numbers[i] + numbers[j] != target){
                j++;
            }
            else if(j = numbers.length-1 && numbers[i] + numbers[j] != target){
                i++;
            }
        }
        return new int[0];
    }
}

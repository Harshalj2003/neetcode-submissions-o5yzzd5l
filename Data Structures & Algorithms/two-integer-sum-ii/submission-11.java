class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length < 1) return new int[0];
        int j = 1;
        int i = 0;          // target = 11
                            //[1,5,9,10]    4
        while(j < numbers.length){       // i      j
            if(numbers[i] + numbers[j] == target){
                return new int[]{i+1, j+1};
            }
            else if(j < numbers.length && numbers[i] + numbers[j] != target){
                j++;
            }
            else if(i < j && j < numbers.length && numbers[i] + numbers[j] != target){
                i++;
            }
        }
        return new int[0];
    }
}

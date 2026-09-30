class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length < 1) return new int[0];
        int j = 1;

        for(int i = 0; i < numbers.length; i++){
            if(j < nums.length && numbers[i] + numbers[j] != target){
                j++;
            }else{
                return new int[]{numbers[i], numbers[j]};
            }
        }
        return new int[0];
    }
}

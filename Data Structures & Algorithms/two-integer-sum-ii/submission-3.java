class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length < 1) return new int[0];
        int j = numbers.length-1;
        int i = 0;

        while(i < j){
            if(numbers[i] + numbers[j] != target){
                j--;
            }else{
                return new int[]{numbers[i], numbers[j]};
            }
        }
        return new int[0];
    }
}

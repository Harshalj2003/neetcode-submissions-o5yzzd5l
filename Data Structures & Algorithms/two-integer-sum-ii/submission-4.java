class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length < 1) return new int[0];
        int j = numbers.length;
        int i = 1;

        while(i-1 < j-1){
            if(numbers[i-1] + numbers[j-1] != target){
                j--;
            }else{
                return new int[]{i, j};
            }
        }
        return new int[0];
    }
}

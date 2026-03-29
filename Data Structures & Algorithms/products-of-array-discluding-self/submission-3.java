class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[i] = 1;
            } else {
                prefix *= nums[i - 1];
                result[i] = prefix;
            }
        }
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                result[i] *= 1;
            } else {
                postfix *= nums[i + 1];
                result[i] *= postfix;
            }
        }
        return result;
    }
}  

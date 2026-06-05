class Solution {
    public int[] productExceptSelf(int[] nums) { //nums = [1,2,4,6]
        int n = nums.length; //4

        int[] result = new int[n]; // result = [0,0,0,0]

        result[0] = 1; // init
        
        for(int i=1;i<n;i++) {               
            result[i] = result[i-1] * nums[i-1];
        } //result = [1,1,2,8]

        int postfix = 1; //you have to solve this problem in O(n)
        //that can be told over here

        for(int i = n-1;i >= 0; i--) { //result = [1,1,2,8]
            result[i] *= postfix; //
            postfix *= nums[i];
        } //result = [8,12,2,8]
        
        return result;
    }
}

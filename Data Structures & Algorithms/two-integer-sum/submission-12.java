class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        if (n < 2) return new int[]{-1};
        // if(( n < 2 && nums[i] == nums[j] && (nums[i] + nums[j]) == target)) return new int[]{-1};

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; ){
                if (nums[i] + nums[j] != target){
                    j++;
                }else{
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1};
    }
}

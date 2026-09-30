class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int i = 0;
        int j = i + 1;

        if (n < 2) return new int[]{-1};
        if(nums[i] == nums[j]) return new int[]{-1};

        while(i < n){
            if ((nums[i] == nums[j] && (nums[i] + nums[j]) == target) nums[i] + nums[j] != target){
                if(j == n-1){
                    i++;
                    j = i+1;
                }
                j++;
            }else{
                return new int[] {i,j};
            }
        }
        return new int[] {-1};
    }
}

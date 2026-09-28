class Solution {
    public boolean hasDuplicate(int[] nums) {
        // if(nums.length > 2) return false;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){

            boolean isTrue = set.add(nums[i]);
            if(!isTrue){
                return true;
            }
        }
        return false;
    }
}
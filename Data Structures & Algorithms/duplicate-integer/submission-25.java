class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums){

            boolean isTrue = set.add(nums[i]);
            if(!isTrue){
                return true;
            }
        }
        return false;
    }
}
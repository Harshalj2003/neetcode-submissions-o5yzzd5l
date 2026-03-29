class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer, Integer> ele = new HashMap<>();
        if(nums.length < 2 || nums == null){
            return false;
        }

        for(int val : nums){
            if(ele.put(val,-1) != null){
                return true;
            }
        }
        return false;
    }
}
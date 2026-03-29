class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer, Integer> ele = new HashMap<>();

        for(int val : nums){
            if(ele.put(val,-1) != null){
                return true;
            }
        }
        return false;
    }
}
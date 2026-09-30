class Solution {
    public boolean hasDuplicate(int[] nums) {
        BitSet bs = new BitSet();
        if(nums.length < 2 || nums == null){
            return false;
        }
        for(int num : nums){if(bs.get(nums)) return true;}
        return false;
    }
}
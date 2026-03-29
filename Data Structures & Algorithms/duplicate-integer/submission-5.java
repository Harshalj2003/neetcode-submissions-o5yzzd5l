public class Solution {
    public boolean hasDuplicate(int[] nums) {
        BitSet bits = new BitSet();
        // Assume the range of numbers is -100,000 to 100,000
        int offset = 100000; 

        for (int num : nums) {
            int shiftedIndex = num + offset; // Normalize to positive
            if (bits.get(shiftedIndex)) {
                return true;
            }
            bits.set(shiftedIndex);
        }
        return false;
    }
}

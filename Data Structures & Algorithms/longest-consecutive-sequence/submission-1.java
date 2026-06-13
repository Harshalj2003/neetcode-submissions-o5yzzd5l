class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        if(nums.length == 0) return 0;

        for(int n : nums) {
            set.add(n);
        }    

        int longest = 0;

        for(int n : nums) {
            if(!set.contains(n-1)){
                int length = 1;
                int curr = n;

                while(set.contains(curr + 1)){
                    curr++;
                    length++;
                }

                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}

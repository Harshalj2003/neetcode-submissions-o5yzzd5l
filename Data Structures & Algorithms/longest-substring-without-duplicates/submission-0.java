class Solution {
    public int lengthOfLongestSubstring(String str) {
        int maxLen = 0;
        HashSet<Character> tracker = new HashSet<>();
        int left = 0;
        for(int right = 0; right < str.length(); right++){
            while(tracker.contains(str.charAt(right))){
                tracker.remove(str.charAt(left));
                left++;
            }
            tracker.add(str.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
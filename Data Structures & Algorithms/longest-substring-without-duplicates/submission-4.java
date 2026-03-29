class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lastseen [] = new int[128];
        Arrays.fill(lastseen, -1);
        int maxLen = 0; int l = 0;
                                                    
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r); 

            if(lastseen[c] >= l){             
                l = lastseen[c] + 1;
            }
            lastseen[c] = r;
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}
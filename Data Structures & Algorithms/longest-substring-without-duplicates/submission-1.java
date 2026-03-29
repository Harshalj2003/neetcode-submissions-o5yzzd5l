class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
                                                    
        while(r < s.length()){
            char c = s.charAt(r);                      
            if(set.contains(c)){                    
                set.remove(s.charAt(l++));        
                                                   
            }else{                                 
                set.add(s.charAt(r));               
                maxLen = Math.max(maxLen, set.size());
                r++;
            }
        }
        return maxLen;
    }
}
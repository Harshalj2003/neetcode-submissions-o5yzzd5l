class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        //Input: s = "Was it a car or a cat I saw?"
        s = s.toLowerCase();

        while(l < r){
            while(l < r && isNonAlphaNum(s.charAt(l))){
                l++;
            }
            while(r > l && isNonAlphaNum(s.charAt(r))){
                r--;
            }
            if(s.charAt(l) != s.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }

    private static boolean isNonAlphaNum(char ch) {
        return
            (ch < 'a' || ch > 'z') &&
            (ch < '0' || ch > '9');
    }
}

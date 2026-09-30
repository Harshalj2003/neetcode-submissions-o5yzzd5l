class Solution {
    public boolean isAnagram(String s, String t) {
        int m = Math.min(s.length(), t.length());
        int n = Math.max(s.length(), t.length());

        if(m != n) return false;
        if(n == 0) return true;

        int i = 0;
        int j = n-1;

        StringBuilder sb = new StringBuilder(t);
        int matched = 0;

        while(i < n){
            if(j < 0){
                return false;
            }else if(s.charAt(i) == sb.charAt(j)){
                sb.setCharAt(j, '#');
            }
            if(s.charAt(i) != t.charAt(j)){
                j--;
            }else if(s.charAt(i) == t.charAt(j)){
                matched += 1;
                i++;
                j = n-1;
            }
        }
        if( n == matched ){
            return true;
        }
        return false;
    }

}
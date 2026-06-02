class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString(); //#3RAG4#Okay2#No -> RAG, okay, No
    }

    public List<String> decode(String str) {
        if(str.isEmpty()) return new ArrayList<>();

        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i,j));
            i = j + 1;
            result.add(str.substring(i, i + length));
            i = i + length;
        }
        return result;
    }
}

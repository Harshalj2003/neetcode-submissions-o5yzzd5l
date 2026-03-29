class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }
        String framedString = sb.toString();

        byte[] strsToBytes = framedString.getBytes();

        return Base64.getEncoder().encodeToString(strsToBytes);
        
    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();

        byte [] StrsToByte = Base64.getDecoder().decode(str);

        String framedString = new String(StrsToByte);

        int i = 0;
        while(i < framedString.length()){
            int j = i;
            while(framedString.charAt(j) != '#') j++;
            int length = Integer.parseInt(framedString.substring(i,j));
            j++;
            list.add(framedString.substring(j, j + length));
            i = j + length;
        }

        return list;

    }
}

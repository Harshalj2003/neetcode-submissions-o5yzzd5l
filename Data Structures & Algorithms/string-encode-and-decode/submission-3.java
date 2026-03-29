class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }
        // String framedString = sb.toString();

        // byte[] strsToBytes = framedString.getBytes();

        return Base64.getEncoder().encodeToString(sb.toString().getBytes());
        
    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();

        byte [] decodedBytes = Base64.getDecoder().decode(str);

        String framedString = new String(decodedBytes);

        int i = 0;
        while(i < framedString.length()){
            int j = framedString.indexOf('#', i);
            // while(framedString.charAt(j) != '#') j++;
            int length = Integer.parseInt(framedString.substring(i,j));
            i = j + 1;
            list.add(framedString.substring(i, i + length));
            i = i + length;
        }

        return list;
    }
}

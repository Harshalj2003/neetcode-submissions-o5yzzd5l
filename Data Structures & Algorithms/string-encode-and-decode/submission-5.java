class Solution {

    public String encode(List<String> strs) {
        // StringBuilder sb = new StringBuilder();
        // for(String str : strs){
        //     sb.append(str.length()).append('#').append(str);
        // }
        
        String encoded = strs.stream()
            .map(str -> str.length() + "#" + str)
            .collect(Collectors.joining());
        // return Base64.getEncoder().encodeToString(sb.toString().getBytes());
        // return sb.toString();
        return encoded;
    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();
        // byte [] decodedBytes = Base64.getDecoder().decode(str);
        // String framedString = new String(decodedBytes);

        int i = 0;
        while(i < str.length()){
            int j = str.indexOf('#', i); //returns index of '#'
            int length = Integer.parseInt(str.substring(i,j));
            i = j + 1; //'#' + 1
            list.add(str.substring(i, i + length));
            i += length;
        }
        return list;
    }
}

class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append('#').append(str);
        }
        return Base64.getEncoder().encodeToString(sb.toString().getBytes());
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        String framedString = new String(Base64.getDecoder().decode(str));
        int i = 0;
        while (i < framedString.length()) {
            int j = framedString.indexOf('#', i);
            int length = Integer.parseInt(framedString.substring(i, j));
            list.add(framedString.substring(j + 1, j + 1 + length));
            i = j + 1 + length;
        }
        return list;
    }
}

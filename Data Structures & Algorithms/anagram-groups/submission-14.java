class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: strs) {
            String hash = charmap(s);
            map.putIfAbsent(hash, new ArrayList<String>());
            map.get(hash).add(s);
        }

        List<List<String>> groups = new ArrayList<>();
        for(String hash: map.keySet()) {
            groups.add(map.get(hash));
        }

        return groups;
    }

    private String charmap(String s) {
        int[] counts = new int[26];
        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()) {
            counts[c-'a']++;
        }

        for(int c: counts) {
            sb.append(c);
            sb.append(':');
        }

        return sb.toString();
    }
}

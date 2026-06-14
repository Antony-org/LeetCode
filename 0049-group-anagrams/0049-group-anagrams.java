class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<>();
        if(strs.length == 1){
            groups.add(new ArrayList<>(List.of(strs[0])));
        }

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
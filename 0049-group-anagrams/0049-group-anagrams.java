class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs){
            int[] alpha = new int[26];
            char[] chars = s.toCharArray();
            
            for(int i = 0; i < chars.length; i++){
                alpha[chars[i] - 'a']++;
            }
            String numbers = Arrays.toString(alpha);

            map.computeIfAbsent(numbers, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
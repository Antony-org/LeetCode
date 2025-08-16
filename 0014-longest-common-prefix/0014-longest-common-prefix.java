class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        int min = Math.min(strs[0].length(), strs[strs.length - 1].length());
        for (int i = 0; i < min; i++) {
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                ans.append(strs[0].charAt(i));
            }
            else{
                return ans.toString();
            }
        }
        return ans.toString();
    }
}
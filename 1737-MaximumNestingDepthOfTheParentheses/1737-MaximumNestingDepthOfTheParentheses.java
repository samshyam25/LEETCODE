// Last updated: 2/26/2026, 9:52:58 AM
class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int openBrackets = 0;

        for (Character c : s.toCharArray()) {
            if (c == '(') {
                openBrackets++;
            } else if (c == ')') {
                openBrackets--;
            }

            ans = Math.max(ans, openBrackets);
        }

        return ans;
    }
}
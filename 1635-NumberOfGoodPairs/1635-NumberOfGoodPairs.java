// Last updated: 2/26/2026, 9:53:12 AM
class Solution {
        public int numIdenticalPairs(int[] A) {
        int ans = 0, cnt[] = new int[101];
        for (int a: A) {
            ans += cnt[a]++;
        }
        return ans;
    }
}
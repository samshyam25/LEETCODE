// Last updated: 2/26/2026, 9:53:55 AM
class Solution {
    public int lastRemaining(int n) {
        
    return n == 1 ? 1 : 2 * (1 + n / 2 - lastRemaining(n / 2));
}
    }

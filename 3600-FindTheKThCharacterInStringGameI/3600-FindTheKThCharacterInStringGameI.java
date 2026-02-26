// Last updated: 2/26/2026, 9:53:09 AM
class Solution {
    public char kthCharacter(int k) {
        return (char)('a' + Integer.bitCount(k-1));
    }
}
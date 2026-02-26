// Last updated: 2/26/2026, 9:54:32 AM
public class Solution {  
    public int hammingWeight(int n) {  
        int count = 0;  
        while (n != 0) {  
            count += n & 1;  
            n >>>= 1; // unsigned right shift  
        }  
        return count;  
    }  
}  
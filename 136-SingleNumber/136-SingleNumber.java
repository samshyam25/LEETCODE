// Last updated: 2/26/2026, 9:54:49 AM
public class Solution {  
    public int singleNumber(int[] nums) {  
        int result = 0;  
        for (int num : nums) {  
            result ^= num;  
        }  
        return result;  
    }  
} 
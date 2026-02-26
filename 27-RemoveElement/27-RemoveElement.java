// Last updated: 2/26/2026, 9:56:06 AM
public class Solution {  
    public int removeElement(int[] nums, int val) {  
        int writeIndex = 0; // Pointer for the next position to write non-val elements  
        for (int num : nums) {  
            if (num != val) {  
                nums[writeIndex] = num; // Write the non-val element  
                writeIndex++;  
            }  
        }  
        return writeIndex; // New length after removing elements  
    }  
}  
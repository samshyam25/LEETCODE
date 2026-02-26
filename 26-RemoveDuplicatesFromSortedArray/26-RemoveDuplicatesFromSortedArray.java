// Last updated: 2/26/2026, 9:56:08 AM
public class Solution {  
    public int removeDuplicates(int[] nums) {  
        if (nums.length == 0) {  
            return 0;  
        }  

        int uniqueIndex = 0; // Pointer for the position of unique elements  
        for (int i = 1; i < nums.length; i++) {  
            if (nums[i] != nums[uniqueIndex]) {  
                uniqueIndex++;  
                nums[uniqueIndex] = nums[i]; // Update the array with unique elements  
            }  
        }  
        return uniqueIndex + 1; // Length of the array with unique elements  
    }  
}
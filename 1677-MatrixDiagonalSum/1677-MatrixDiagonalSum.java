// Last updated: 2/26/2026, 9:52:55 AM
public class Solution {  
    public int diagonalSum(int[][] mat) {  
        int n = mat.length; // Size of the square matrix  
        int sum = 0;  

        for (int i = 0; i < n; i++) {  
            sum += mat[i][i]; // Add primary diagonal element  
            sum += mat[i][n - 1 - i]; // Add secondary diagonal element  
        }  

        // If the matrix length is odd, subtract the middle element once  
        if (n % 2 == 1) {  
            sum -= mat[n / 2][n / 2];  
        }  

        return sum; // Return the final sum  
    }  
}  
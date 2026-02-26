// Last updated: 2/26/2026, 9:53:45 AM
public class Solution {  
    public String reverseWords(String s) {  
        String[] words = s.split(" ");  
        StringBuilder reversedString = new StringBuilder();  
        for (String word : words) {  
            StringBuilder reversedWord = new StringBuilder(word).reverse();  
            reversedString.append(reversedWord).append(" ");  
        }    
        return reversedString.toString().trim();  
    }  

    public static void main(String[] args) {  
        Solution solution = new Solution();  
        String input = "Let's take LeetCode contest";  
        String output = solution.reverseWords(input);  
        System.out.println(output); 
    }  
}  
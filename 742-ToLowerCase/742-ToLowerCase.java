// Last updated: 2/26/2026, 9:53:40 AM
public class Solution {  
    public String toLowerCase(String str) {  
        StringBuilder result = new StringBuilder();  
        for (char c : str.toCharArray()) {  
            if (c >= 'A' && c <= 'Z') {  
                result.append((char) (c + 32)); 
            } else {  
                result.append(c);   
            }  
        }  
        return result.toString();  
    }  
}
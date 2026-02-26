// Last updated: 2/26/2026, 9:53:47 AM
class Solution {
     public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Large array, acts similar to map
        int[] mp = new int[10001];
        
        Stack<Integer> s = new Stack<Integer>();

        // Find and store the Next greater element in array
        for(int i=0;i<nums2.length;i++){
            while(!s.isEmpty() && s.peek() < nums2[i]){
                mp[s.pop()] = nums2[i];
            } 
            s.push(nums2[i]); 
        }

        int ans = -1;
        // Reusing the nums1 array to store the Next greater element
        for(int i=0;i<nums1.length;i++){
            ans = mp[nums1[i]];
            if(ans==0){
                nums1[i] = -1;
            } else {
                nums1[i]=ans;
            }
        }

        return nums1;
    }
}
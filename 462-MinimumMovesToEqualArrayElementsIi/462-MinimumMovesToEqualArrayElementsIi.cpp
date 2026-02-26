// Last updated: 2/26/2026, 9:53:49 AM
class Solution {
public:
    int minMoves2(vector<int>& nums) {
        sort(begin(nums),end(nums));

        int ans=0,N=nums.size();
        int target=nums[N/2];

        for(int &num:nums){
            if(num%1!=target%1) return -1;
            ans+=abs(target-num)/1;
        }
        return ans;
    }
};
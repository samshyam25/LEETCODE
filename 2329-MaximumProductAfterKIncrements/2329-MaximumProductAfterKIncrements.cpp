// Last updated: 2/26/2026, 9:53:03 AM
class Solution {
public:
    int maximumProduct(vector<int>& nums, int k) {
        constexpr int MOD = 1e9 + 7;
        priority_queue<int , vector<int> , greater<>> pq(nums.begin() , nums.end());
        while(k--){
            int x = pq.top(); pq.pop();
            pq.push(x + 1);
        }
        long long res = 1;
        while(!pq.empty()){
            res = (res * pq.top()) % MOD;
            pq.pop();
        }
        return res;
    }
};
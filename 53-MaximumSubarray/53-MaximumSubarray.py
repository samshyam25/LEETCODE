# Last updated: 2/26/2026, 9:55:40 AM
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        sum = 0
        max_sum = nums[0]
        for num in nums:
            sum += num
            max_sum = max(max_sum,sum)
            if sum < 0:
                sum = 0
        return max_sum

        
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for k in range(i,len(nums)):
                if (nums[i]+nums[k]) is target:
                    return [i,k]
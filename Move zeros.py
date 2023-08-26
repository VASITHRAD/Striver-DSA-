class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        ind=0
        for i in range(len(nums)):
            if nums[i]!=0:
                nums[ind]=nums[i]
                ind+=1
        while ind < len(nums):
            nums[ind]=0
            ind+=1
        return nums
                

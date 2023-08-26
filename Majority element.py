lass Solution:
    def majorityElement(self, nums: List[int]) -> int:
        li=[]
        c=[]
        for i in nums:
            if i not in li:
                li.append(i)
        li=sorted(li)
        for j in range(len(li)):
            s=0
            for k in range(len(nums)):
                if li[j] == nums[k]:
                    s+=1
            c.append(s)
        m=max(c)
        ind=c.index(m)
        ele=li[ind]
        return ele

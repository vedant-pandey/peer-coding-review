def linear_search(nums, target):
    for i in range(len(nums)):
        if nums[i] == target:
            return i

    return -1

def binary_search(nums, target):
    nums.sort()
    l = 0
    h = len(nums)-1
    while l<=h:
        m = (l+h)//2
        if target == nums[m]:
            return m
        elif target < nums[m]:
            h = m - 1
        else:
            l = m + 1

    return -1
    

print(binary_search([1, 2, 3, 4, 5, 6], 7))
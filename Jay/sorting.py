from heapq import merge


def bubble_sort(nums, asc = 1): # asc = -1 for descending order
    for i in range(len(nums)):
        for j in range(len(nums)-i-1):
            if asc * nums[j] > asc *  nums[j+1]:
                temp = nums[j+1]
                nums[j+1] = nums[j]
                nums[j] = temp
    return nums

def merge_sort(nums, asc = 1): # asc = -1 for descending order
    if len(nums) > 1:
        m = len(nums) // 2
        L = nums[:m]

        R = nums[m:]

        merge_sort(L, asc)
        merge_sort(R, asc)

        i, j, k = 0, 0, 0

        while i < len(L) and j < len(R):
            if asc * L[i] >  asc * R[j]:
                nums[k] =R[j]
                j+=1
            else:
                nums[k] = L[i]
                i+=1
            k+=1

        while i < len(L):
            nums[k] = L[i]
            i+=1
            k+=1

        while j < len(R):
            nums[k] = R[j]
            j+=1
            k+=1
    return nums


arr = [7, 1, 3, 5, 10]
print(merge_sort(arr, -1))
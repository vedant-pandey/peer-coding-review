# Q1 =>
# a. Linear Search
def linearSeach(arr, e):
    if e in arr:
        return "{a} is present in {arr}.".format(a = e, arr = arr)
    return "{a} is not present in {arr}.".format(a = e, arr = arr)

# b. Binary Search
def binarySearch(lst, lowValue, highValue, e):
    if highValue >= lowValue:
        midian = (highValue + lowValue) // 2
        if lst[midian] == e:
            return "{a} is present in {arr}.".format(a = e, arr = lst)
        elif lst[midian] > e:
            return binarySearch(lst, lowValue, midian-1, e)
        else :
            return binarySearch(lst, midian +1, highValue, e)
    return "{a} is is not present in {arr}.".format(a = e, arr = lst)

# c. Bubble Sort
def bubbleSorting(lst):
    n = len(lst)
    for i in range(n-1):
        for j in range(0, n-i-1):
            if lst[j] > lst[j + 1] :
                lst[j], lst[j + 1] = lst[j + 1], lst[j]
    return  lst


# Q.2 =>
def magicNumber(n):
    power = 1
    ans = 0
    while (n):
        power = power*5
        if (n & 1):
            ans += power
        n >>= 1 
    return ans

if __name__ == "__main__":
    # a :
    b = input("Enter no for linear search : ")
    a = [2, 5, 9, 11, 20, 30]
    print(linearSeach(a, int(b)))
    print("____________________________________________________________")
    # b :
    lst = [ 12, 3, 4, 10, 40 ]
    x = input("Enter no for binary search : ")
    print(binarySearch(sorted(lst), 0, len(lst)-1, int(x)))
    print("____________________________________________________________")
    # c :
    lst1 = [64, 34, 25, 12, 22, 11, 90]
    print("Bubble sorted list : ", bubbleSorting(lst1))
    print("____________________________________________________________")
    # Q.2 =>
    n = input("Please enter number to get magic number : ")
    print("Magic number is", magicNumber(int(n)))



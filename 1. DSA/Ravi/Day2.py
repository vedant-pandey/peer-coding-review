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


if __name__ == "__main__":
    # a :
    b = input("Enter no for linear search : ")
    a = [2, 5, 9, 11, 20, 30]
    print(linearSeach(a, int(b)))

    # b :
    lst = [ 12, 3, 4, 10, 40 ]
    x = input("Enter no for binary search : ")
    print(binarySearch(sorted(lst), 0, len(lst)-1, int(x)))

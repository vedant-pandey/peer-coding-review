# Questions


## I. Implement the following algorithms

- Linear search - (int[] unsortedArr, int elemToFind)
- Binary search - (int[] sortedArr, int elemToFind)
- Bubble sort - (int[] unsortedArr)
- Merge sort - (int[] unsortedArr)

---

---

## II. Magic number

Given an integer A, find and return the Ath magic number.

A magic number is defined as a number which can be expressed as a power of 5 or sum of unique powers of 5.

First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….

### Problem Constraints

1 <= A <= 5000

---

### Input Format

The only argument given is integer A.

---

### Output Format

Return the Ath magic number.

---

### Example Input

Example Input 1:

``A = 3``

Example Input 2:

``A = 10``

---

### Example Output

Example Output 1:

``30``

Example Output 2:

``650``

---

### Example Explanation

Explanation 1:

```
A in increasing order is [5, 25, 30, 125, 130, ...] 3rd element in this is 30
```

Explanation 2:

```
In the sequence shown in explanation 1, 10th element will be 650.
```

---

---

> Note -
> 
> - Each question must have its own class and subparts of the question can correspond to method/sub-classes
> - Write unit test for each question subpart
> - Write the time complexity in the output before printing test cases (write complexity only once)
> - Time each algorithm and print its runtime for each testcase. For eg -
>   ```python
>   - Testcase 1 - [1, 2, 3, 4, 5]
>     - Bubble sort - 100ms
>     - Merge sort - 30ms
>   
>   - Testcase 2 - [3, 4, 1, 5, 2]
>     - Bubble sort - 120ms
>     - Merge sort - 50ms
>   ```
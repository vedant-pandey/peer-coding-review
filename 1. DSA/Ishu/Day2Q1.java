/**
 * @author ishu
 *
 *         Steps to run the file :- javac Day2.java, java Day2
 *         Check the console for output
 */
import java.util.Arrays;
public class Day2Q1 {
    public static int linearSearch(int[] unsortedArr, int elemToFind) {
        for (int index = 0; index < unsortedArr.length; index++) { // Loop to visit each element of the array

            if (unsortedArr[index] == elemToFind) {      // Condition to check if the current element of the array
                                                     // is equal to elemToFind
                return index;
            }
        }
        return -1;

    }
    public static int binarySearch(int[] sortedArr, int elemToFind) {
        int left = 0;                            // starting index of the array
        int right = sortedArr.length - 1;        // ending  index of the array

        while (left <= right) {
            int middle = left + (right - left) / 2;  // Calculating middle index of the array

            if (sortedArr[middle] == elemToFind) { return middle; } // if the element stored in
                                                                    // middle index is equal to elemToFind return the index
            if (sortedArr[middle] < elemToFind) { left = middle + 1; }

            if (sortedArr[middle] > elemToFind) { right = middle - 1; }

        }
        return -1;

    }
    public static int[] bubbleSort(int[] unsortedArr) {
        if ( unsortedArr.length == 1 ) { return unsortedArr; }

        for (int i = 0; i < unsortedArr.length-1; i++) {

            for (int j = 0; j < unsortedArr.length - i - 1; j++) {

                if (unsortedArr[j] > unsortedArr[j + 1]) {

                    int temp = unsortedArr[j];
                    unsortedArr[j] = unsortedArr[j + 1];
                    unsortedArr[j + 1] = temp;
                }

            }

        }

        return  unsortedArr;

    }
    public static void merge(int[] array, int[] left_array, int[] right_array, int left, int right) {
        int x = 0, y = 0, z = 0;
        while (x < left && y < right) {
            if (left_array[x] <= right_array[y]) {
                array[z++] = left_array[x++];
            }
            else {
                array[z++] = right_array[y++];
            }
        }
        while (x < left) {
            array[z++] = left_array[x++];
        }
        while (y < right) {
            array[z++] = right_array[y++];
        }
    }
    public static int[] mergeSort(int[] array, int length) {
        if (length <= 1) {
            return array;
        }
        int middle = length / 2;
        int[] left_array = new int[middle];
        int[] right_array = new int[length - middle];

        for (int i = 0; i < middle; i++) {
            left_array[i] = array[i];
        }
        for (int i = middle; i < length; i++) {
            right_array[i - middle] = array[i];
        }
        mergeSort(left_array, middle);
        mergeSort(right_array, length - middle);

        merge(array, left_array, right_array, middle, length - middle);

        return array;
    }
    public static void main(String args[]) {

        // LINEAR SEARCH  O(n)
       // unsortedArr =  {3, 4, 1, 5, 2}, elemToFind = 5  Output:- 4
       int linearresult = linearSearch(new int[] {3, 4, 1, 5, 2}, 5);
       if( linearresult == -1) {  System.out.println("Element Not Found "); }
       else {
           System.out.println("LINEAR SEARCH  O(n).");
           System.out.println("Element Found at position :- " + (linearresult + 1));
       }

        // BINARY SEARCH O(log n)
       //sortedArr =  {3, 4, 7, 11, 19}, elemToFind = 4  Output:- 2
       int binaryresult = binarySearch(new int[] {3, 4, 7, 11, 19}, 4);
       if( binaryresult == -1) {  System.out.println("Element Not Found "); }
       else {
           System.out.println("BINARY SEARCH O(log n).");
           System.out.println("Element Found at position :- " + (binaryresult + 1));
        }

        // BUBBLE SORT
        // input= {1, 2, 3, 4, 5} Output = {1, 2, 3, 4, 5}
       long start1 = System.currentTimeMillis();
       int[] bubblearray1 = bubbleSort(new int[] {1, 2, 3, 4, 5});
       long end1 = System.currentTimeMillis();
       System.out.println("BUBBLE SORT 0(n^2) " + Arrays.toString(bubblearray1));
       long timeElapsed1 = end1 - start1;
       System.out.println("BUBBLE SORT " + timeElapsed1 + "ms");

        // input= {3, 4, 1, 5, 2} Output = {1, 2, 3, 4, 5}
       long start2 = System.currentTimeMillis();
       int[] bubblearray2 = bubbleSort(new int[] {3, 4, 3, 1, 2});
       long end2 = System.currentTimeMillis();
       System.out.println("BUBBLE SORT 0(n^2) :-  " + Arrays.toString(bubblearray2));
       System.out.println("BUBBLE SORT :- " +   (end2 - start2) + "ms");

        // MERGE SORT
        // input= {1, 2, 3, 4, 5} , length = 5 Output = {1, 2, 3, 4, 5}
        long start3 = System.currentTimeMillis();
        int[] mergearray1 = mergeSort(new int[] {1, 2, 3, 4, 5}, 5);
        long end3 = System.currentTimeMillis();
        System.out.println("MERGE SORT O(n log n)  " + Arrays.toString(mergearray1));
        System.out.println("MERGE SORT " +   (end3 - start3) + "ms");


        // input= {3, 4, 1, 5, 2} Output = {1, 2, 3, 4, 5}
        long start4 = System.currentTimeMillis();
        int[] mergearray2 = mergeSort(new int[] {3, 4, 1, 5, 2},5);
        long end4 = System.currentTimeMillis();
        System.out.println("MERGE SORT O(n log n)  " + Arrays.toString(mergearray2));
        System.out.println("MERGE SORT " +   (end4 - start4) + "ms");

    }
}

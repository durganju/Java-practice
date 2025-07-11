package java_tasks.Day16;
import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        System.out.println("--- Java Insertion Sort Examples ---");
        int[] arr1 = {12, 11, 13, 5, 6};
        System.out.println("Original array 1: " + Arrays.toString(arr1));
        insertionSort(arr1);
        System.out.println("Sorted array 1:   " + Arrays.toString(arr1));
        System.out.println("--------------------------------");

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Original array 2: " + Arrays.toString(arr2));
        insertionSort(arr2);
        System.out.println("Sorted array 2:   " + Arrays.toString(arr2));
        System.out.println("--------------------------------");

        int[] arr3 = {5, 4, 3, 2, 1};
        System.out.println("Original array 3: " + Arrays.toString(arr3));
        insertionSort(arr3);
        System.out.println("Sorted array 3:   " + Arrays.toString(arr3));
        System.out.println("--------------------------------");

        int[] arr4 = {4, 2, 1, 3, 2, 4};
        System.out.println("Original array 4: " + Arrays.toString(arr4));
        insertionSort(arr4);
        System.out.println("Sorted array 4:   " + Arrays.toString(arr4));
        System.out.println("--------------------------------");

        int[] arr5 = {};
        System.out.println("Original array 5: " + Arrays.toString(arr5));
        insertionSort(arr5);
        System.out.println("Sorted array 5:   " + Arrays.toString(arr5));
        System.out.println("--------------------------------");

        int[] arr6 = {7};
        System.out.println("Original array 6: " + Arrays.toString(arr6));
        insertionSort(arr6);
        System.out.println("Sorted array 6:   " + Arrays.toString(arr6));
        System.out.println("--------------------------------");
    }
}

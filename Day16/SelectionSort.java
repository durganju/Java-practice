package java_tasks.Day16;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] myList1 = {64, 25, 12, 22, 11};
        System.out.println("Original list 1: " + Arrays.toString(myList1));
        selectionSort(myList1);
        System.out.println("Sorted list 1:   " + Arrays.toString(myList1));
        System.out.println("--------------------------------");
        int[] myList2 = {1, 2, 3, 4, 5};
        System.out.println("Original list 2: " + Arrays.toString(myList2));
        selectionSort(myList2);
        System.out.println("Sorted list 2:   " + Arrays.toString(myList2));
        System.out.println("--------------------------------");
        int[] myList3 = {5, 4, 3, 2, 1};
        System.out.println("Original list 3: " + Arrays.toString(myList3));
        selectionSort(myList3);
        System.out.println("Sorted list 3:   " + Arrays.toString(myList3));
        System.out.println("--------------------------------");
        int[] myList4 = {4, 2, 1, 3, 2, 4};
        System.out.println("Original list 4: " + Arrays.toString(myList4));
        selectionSort(myList4);
        System.out.println("Sorted list 4:   " + Arrays.toString(myList4));
        System.out.println("--------------------------------");
        int[] myList5 = {};
        System.out.println("Original list 5: " + Arrays.toString(myList5));
        selectionSort(myList5);
        System.out.println("Sorted list 5:   " + Arrays.toString(myList5));
        System.out.println("--------------------------------");
        int[] myList6 = {7};
        System.out.println("Original list 6: " + Arrays.toString(myList6));
        selectionSort(myList6);
        System.out.println("Sorted list 6:   " + Arrays.toString(myList6));
        System.out.println("--------------------------------");
    }
}
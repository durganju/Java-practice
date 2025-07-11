package java_tasks.Day16;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    public static void main(String[] args) {
        System.out.println("--- Java Quick Sort Examples ---");

        int[] arr1 = {10, 7, 8, 9, 1, 5};
        System.out.println("Original array 1: " + Arrays.toString(arr1));
        quickSort(arr1, 0, arr1.length - 1);
        System.out.println("Sorted array 1:   " + Arrays.toString(arr1));
        System.out.println("--------------------------------");

        int[] arr2 = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array 2: " + Arrays.toString(arr2));
        quickSort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted array 2:   " + Arrays.toString(arr2));
        System.out.println("--------------------------------");

        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("Original array 3: " + Arrays.toString(arr3));
        quickSort(arr3, 0, arr3.length - 1);
        System.out.println("Sorted array 3:   " + Arrays.toString(arr3));
        System.out.println("--------------------------------");

        int[] arr4 = {5, 4, 3, 2, 1};
        System.out.println("Original array 4: " + Arrays.toString(arr4));
        quickSort(arr4, 0, arr4.length - 1);
        System.out.println("Sorted array 4:   " + Arrays.toString(arr4));
        System.out.println("--------------------------------");
    }
}

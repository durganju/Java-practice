package java_tasks.Day16;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {

            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    private static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] leftTempArray = new int[n1];
        int[] rightTempArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftTempArray[i] = arr[low + i];
        }
        for (int j = 0; j < n2; j++) {
            rightTempArray[j] = arr[mid + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = low;

        while (i < n1 && j < n2) {
            if (leftTempArray[i] <= rightTempArray[j]) {
                arr[k] = leftTempArray[i];
                i++;
            } else {
                arr[k] = rightTempArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftTempArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightTempArray[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        System.out.println("--- Java Merge Sort Examples ---");

        int[] arr1 = {12, 11, 13, 5, 6, 7};
        System.out.println("Original array 1: " + Arrays.toString(arr1));
        mergeSort(arr1, 0, arr1.length - 1);
        System.out.println("Sorted array 1:   " + Arrays.toString(arr1));
        System.out.println("--------------------------------");

        int[] arr2 = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array 2: " + Arrays.toString(arr2));
        mergeSort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted array 2:   " + Arrays.toString(arr2));
        System.out.println("--------------------------------");

        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("Original array 3: " + Arrays.toString(arr3));
        mergeSort(arr3, 0, arr3.length - 1);
        System.out.println("Sorted array 3:   " + Arrays.toString(arr3));
        System.out.println("--------------------------------");

        int[] arr4 = {5, 4, 3, 2, 1};
        System.out.println("Original array 4: " + Arrays.toString(arr4));
        mergeSort(arr4, 0, arr4.length - 1);
        System.out.println("Sorted array 4:   " + Arrays.toString(arr4));
        System.out.println("--------------------------------");
    }
}

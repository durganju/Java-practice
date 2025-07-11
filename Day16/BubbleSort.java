import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }


            if (!swapped) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("--- Java Bubble Sort Examples ---");


        int[] myList1 = {5, 1, 4, 2, 8};
        System.out.println("Original list 1: " + Arrays.toString(myList1));
        bubbleSort(myList1);
        System.out.println("Sorted list 1:   " + Arrays.toString(myList1));
        System.out.println("--------------------------------");


        int[] myList2 = {1, 2, 3, 4, 5};
        System.out.println("Original list 2: " + Arrays.toString(myList2));
        bubbleSort(myList2);
        System.out.println("Sorted list 2:   " + Arrays.toString(myList2));
        System.out.println("--------------------------------");


        int[] myList3 = {5, 4, 3, 2, 1};
        System.out.println("Original list 3: " + Arrays.toString(myList3));
        bubbleSort(myList3);
        System.out.println("Sorted list 3:   " + Arrays.toString(myList3));
        System.out.println("--------------------------------");


        int[] myList4 = {4, 2, 1, 3, 2, 4};
        System.out.println("Original list 4: " + Arrays.toString(myList4));
        bubbleSort(myList4);
        System.out.println("Sorted list 4:   " + Arrays.toString(myList4));
        System.out.println("--------------------------------");


        int[] myList5 = {};
        System.out.println("Original list 5: " + Arrays.toString(myList5));
        bubbleSort(myList5);
        System.out.println("Sorted list 5:   " + Arrays.toString(myList5));
        System.out.println("--------------------------------");


        int[] myList6 = {7};
        System.out.println("Original list 6: " + Arrays.toString(myList6));
        bubbleSort(myList6);
        System.out.println("Sorted list 6:   " + Arrays.toString(myList6));
        System.out.println("--------------------------------");
    }
}
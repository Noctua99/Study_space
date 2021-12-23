package chapter06;

import java.util.Arrays;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        insertionSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    public static void insertionSort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                    System.out.println(Arrays.toString(arr));
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

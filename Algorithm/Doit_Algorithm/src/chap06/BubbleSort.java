package chap06;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        System.out.println("Array Before Bubble Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        BubbleSort sample = new BubbleSort();
        sample.bubbleSort(arr);

        System.out.println("Array After Bubble Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

    public void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}

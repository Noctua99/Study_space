package chap06;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort sample = new InsertionSort();

        int[] arr = new int[]{7, 3, 2, 8, 9, 4, 6, 1, 5};
        sample.insertingSort(arr, arr.length);
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    public void insertingSort(int[] arr, int length) {
        for (int i = 1; i < length; i++) {
            while (true) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                    i--;
                }
                if (i <= 0 || arr[i] >= arr[i - 1]) break;
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

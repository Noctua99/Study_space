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
        sample.bubbleSort2(arr, arr.length);

        System.out.println("Array After Bubble Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

    private void bubbleSort(int[] a, int size) {

        // round는 배열 크기 - 1 만큼 진행됨
        for (int i = 1; i < size; i++) {

            boolean swapped = false;

            // 각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
            for (int j = 0; j < size - i; j++) {

                /*
                 *  현재 원소가 다음 원소보다 클 경우
                 *  서로 원소의 위치를 교환하고
                 *  비교수행을 했다는 표시로 swapped 변수를 true로 변경한다.
                 */
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    swapped = true;
                }
            }

            /*
             * 만약 swap된적이 없다면 이미 정렬되었다는 의미이므로
             * 반복문을 종료한다.
             */
            if (!swapped) {
                break;
            }
        }
    }

    private void bubbleSort2(int[] a, int n) {
        int k = 0;    // a[k]보다 앞쪽은 정렬을 마친 상태
        while (k < n - 1) {
            int last = n - 1;
            for (int j = n - 1; j > k; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    last = j;
                }
            }
            k = last;
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

package chap06;

import chap04.IntStack;

public class QuickSort {
    public static void main(String[] args) {
        QuickSort sample = new QuickSort();
        int[] arr = new int[]{5, 8, 4, 2, 6, 1, 3, 9, 7};
        sample.quickSort2(arr, 0, arr.length - 1);
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    public void quickSort(int[] a, int left, int right) {
        int pl = left;
        int pr = right;
        int x = a[(pl + pr) / 2];

        System.out.printf("a[%d]~a[%d] : {", left, right);
        for (int i = left; i < right; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.printf("%d}\n", a[right]);

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if (pl <= pr) swap(a, pl++, pr--);
        } while (pl <= pr);
        if (left < pr) quickSort(a, left, pr);
        if (pl < right) quickSort(a, pl, right);
    }

    public void quickSort2(int[] a, int left, int right) {
        IntStack lstack = new IntStack(right - left + 1);
        IntStack rstack = new IntStack(right - left + 1);

        lstack.push(left);
        lstack.push(right);

        while (!lstack.isEmpty()) {
            int pl = left = lstack.pop();
            int pr = right = rstack.pop();
            int x = a[(left + right) / 2];

            do {
                while (a[pl] < x) pl++;
                while (a[pr] > x) pr--;
                if (pl <= pr) swap(a, pl++, pr--);
            } while (pl <= pr);

            if (left < pr) {
                lstack.push(left);
                rstack.push(pr);
            }
            if (pl < right) {
                lstack.push(pl);
                rstack.push(right);
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

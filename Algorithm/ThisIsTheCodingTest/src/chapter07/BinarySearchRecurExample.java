package chapter07;

public class BinarySearchRecurExample {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        int result = binarySearchRecur(numbers, 0, 9, 7);
        if (result == -1) {
            System.out.println("원소가 존재하지 않습니다.");
        } else {
            System.out.println(result);
        }
    }

    public static int binarySearchRecur(int[] arr, int first, int last, int key) {
        if (last >= first) {
            int mid = (first + last) / 2;
            if (arr[mid] == key) {
                return mid + 1;
            }
            if (arr[mid] > key) {
                return binarySearchRecur(arr, first, mid - 1, key);
            } else {
                return binarySearchRecur(arr, mid + 1, last, key);
            }
        }
        return -1;
    }
}

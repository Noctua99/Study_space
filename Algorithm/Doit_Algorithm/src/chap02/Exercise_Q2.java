package chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise_Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Number of elements : ");
        int arrayLength = Integer.parseInt(br.readLine());

        int[] numbers = new int[arrayLength];
        System.out.println("Fill in the array");
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        reverse(numbers);
        System.out.println("Array is changed in reverse order");
    }

    public static void swap(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }

    public static void reverse(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length / 2; i++) {
            swap(numbers, i, length - i - 1);
            System.out.println("Exchange numbers[" + i + "] and numbers[" + (length - i - 1) + "]");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}

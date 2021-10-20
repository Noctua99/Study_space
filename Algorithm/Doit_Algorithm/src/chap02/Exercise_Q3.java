package chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise_Q3 {
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

        System.out.println("The sum of all elements in array is " + sumOf(numbers));
    }

    public static int sumOf(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

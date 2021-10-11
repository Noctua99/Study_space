package chapter03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class LawOfLargeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<Integer> inputList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            inputList.add(Integer.parseInt(st.nextToken()));
        }

        int first_max = inputList.get(0);
        for (int data : inputList) {
            if (data > first_max) {
                first_max = data;
            }
        }
        inputList.remove(Integer.valueOf(first_max));

        int second_max = inputList.get(0);
        for (int data : inputList) {
            if (data > second_max) {
                second_max = data;
            }
        }

        int sum = 0;
        sum += m / (k + 1) * (k * first_max + second_max);
        sum += m % (k + 1) * first_max;

        System.out.println(sum);
    }
}

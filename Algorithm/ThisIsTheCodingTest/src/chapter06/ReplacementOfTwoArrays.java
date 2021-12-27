package chapter06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ReplacementOfTwoArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numOfElements = Integer.parseInt(st.nextToken());
        int maxNumOfReplacement = Integer.parseInt(st.nextToken());

        int[] array1 = new int[numOfElements];
        int[] array2 = new int[numOfElements];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfElements; i++) {
            array1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfElements; i++) {
            array2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i = 0; i < maxNumOfReplacement; i++) {
            if (array1[i] >= array2[numOfElements - 1 - i])
                break;
            array1[i] = array2[numOfElements - 1 - i];
        }

        int sum = 0;
        for (int i = 0; i < numOfElements; i++) {
            sum += array1[i];
        }

        System.out.println(sum);
    }
}

package chapter07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakingRiceCake {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numOfRiceCake = Integer.parseInt(st.nextToken());
        int requestedLen = Integer.parseInt(st.nextToken());

        int[] riceCakes = new int[numOfRiceCake];
        int max = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfRiceCake; i++) {
            riceCakes[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, riceCakes[i]);
        }

        System.out.println(findMaxHeight(riceCakes, requestedLen, max));
    }

    public static int findMaxHeight(int[] arr, int target, int max) {
        int first = 0;
        int last = max;
        while (first <= last) {
            int mid = (first + last) / 2;

            long sum = 0;
            for (int data : arr) {
                if (data > mid) {
                    sum += (data - mid);
                }
            }
            if (sum == target) {
                return mid;
            } else if (sum > target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        System.out.println("first: " + first + " last: " + last);
        return last;
    }
}

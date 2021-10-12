package chapter03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UntilItBecomesOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int count = 0;
//        while (n != 1) {  // O(n)
//            if (n % k == 0) {
//                n /= k;
//            } else {
//                n--;
//            }
//            count++;
//        }

        while (n >= k) {
            int target = (n / k) * k;
            count += n - target;
            n = target;
            n /= k;
            count++;
        }

        System.out.println(count);
    }
}

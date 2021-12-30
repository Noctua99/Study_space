package chapter07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class FindingParts {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

//        usingTheSet();
//        usingTheArray();
        usingTheBinarySearch();

        System.out.println(sb);
    }

    public static void usingTheSet() throws IOException {
        HashSet<Integer> parts = new HashSet<>();

        int numOfParts = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (numOfParts-- > 0) {
            parts.add(Integer.parseInt(st.nextToken()));
        }

        int numOfRequests = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (numOfRequests-- > 0) {
            if (parts.contains(Integer.parseInt(st.nextToken()))) {
                sb.append("yes ");
            } else {
                sb.append("no ");
            }
        }
    }

    public static void usingTheArray() throws IOException {
        boolean[] parts = new boolean[1_000_001];

        int numOfParts = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (numOfParts-- > 0) {
            parts[Integer.parseInt(st.nextToken())] = true;
        }

        int numOfRequests = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (numOfRequests-- > 0) {
            if (parts[Integer.parseInt(st.nextToken())]) {
                sb.append("yes ");
            } else {
                sb.append("no ");
            }
        }
    }

    public static void usingTheBinarySearch() throws IOException {
        int numOfParts = Integer.parseInt(br.readLine());
        int[] parts = new int[numOfParts];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfParts; i++) {
            parts[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(parts);

        int numOfRequests = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (numOfRequests-- > 0) {
            if (containBinarySearch(parts, Integer.parseInt(st.nextToken()))) {
                sb.append("yes ");
            } else {
                sb.append("no ");
            }
        }
    }

    public static boolean containBinarySearch(int[] arr, int key) {
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] > key) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return false;
    }
}

package chapter07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SequentialSearchExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        System.out.println("생성할 원소 개수를 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요.");
        st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        String target = st.nextToken();

        String[] elements = new String[len];

        System.out.println("앞서 적은 원소 개수만큼 문자열을 입력하세요. 구분은 띄어쓰기 한 칸으로 합니다.");
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < len; i++) {
            elements[i] = st.nextToken();
        }

        System.out.println(sequentialSearch(elements, target));
    }

    public static int sequentialSearch(String[] arr, String target) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (arr[i].equals(target)) {
                return i + 1;
            }
        }
        return -1;
    }
}

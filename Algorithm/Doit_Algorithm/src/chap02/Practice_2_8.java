package chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = Integer.parseInt(br.readLine());
            } while (no < 0);
            do {
                System.out.print("어떤 진수로 변환할까요? (2~36) : ");
                cd = Integer.parseInt(br.readLine());
            } while (cd < 2 || cd > 36);
            dno = cardConvR2(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for (int i = 0; i <= dno; i++) {
                System.out.print(cno[i]);
            }
            System.out.println("입니다");

            System.out.println("한 번 더 할까요? (1. 예 / 0. 아니오) : ");
            retry = Integer.parseInt(br.readLine());
        } while (retry == 1);


    }

    public static int cardConvR(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);
        return digits;
    }

    public static int cardConvR2(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);
        for (int i = 0; i < digits / 2; i++) {
            char temp = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = temp;
        }
        return digits;
    }
}

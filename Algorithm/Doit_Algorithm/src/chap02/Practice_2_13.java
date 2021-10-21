package chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2_13 {
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int retry;

        System.out.println("그 해 경과 일수를 구합니다");

        do {
            System.out.print("year : ");
            int year = Integer.parseInt(br.readLine());
            System.out.print("month : ");
            int month = Integer.parseInt(br.readLine());
            System.out.print("day : ");
            int day = Integer.parseInt(br.readLine());

            System.out.println(dayOfYear(year, month, day) + "일째입니다");

            System.out.println("한 번 더 할까요? (1.예 / 2.아니오");
            retry = Integer.parseInt(br.readLine());
        } while (retry == 1);
    }

    static int isLeap(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) return 1;
        else return 0;
    }

    static int dayOfYear(int year, int month, int day) {
        int days = day;
        for (int i = 1; i < month; i++) {
            days += mdays[isLeap(year)][i - 1];
        }
        return days;
    }
}

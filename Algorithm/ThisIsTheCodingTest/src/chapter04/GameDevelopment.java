package chapter04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GameDevelopment {
    static int direction;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // N, M을 공백으로 구분하여 입력받기
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 방문한 위치를 저장하기 위한 맵을 생성하여 0으로 초기화
        boolean[][] isVisited = new boolean[N][M];
        // 현재 캐릭터의 X 좌표, Y좌표, 방향을 입력받기
        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        direction = Integer.parseInt(st.nextToken());
        isVisited[y][x] = true; // 현재 좌표 방문 처리

        // 전체 맵 정보를 입력받기
        int[][] gameMap = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                gameMap[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 북, 동, 남, 서 방향 정의
        int[] dy = {-1, 0, 1, 0};
        int[] dx = {0, 1, 0, -1};

        // 시뮬레이션 시작
        int count = 1;
        int turnTime = 0;
        while (true) {
            // 왼쪽으로 회전
            turnLeft();
            int ny = y + dy[direction];
            int nx = x + dx[direction];
            // 회전한 이후 정면에 가보지 않은 칸이 존재하는 경우 이동
            if (!isVisited[ny][nx] && gameMap[ny][nx] == 0) {
                isVisited[ny][nx] = true;
                y = ny;
                x = nx;
                count++;
                turnTime = 0;
                continue;
            } else {    // 회전한 이후 정면에 가보지 않은 칸이 없거나 바다인 경우
                turnTime++;
            }
            // 네 방향 모두 갈 수 없는 경우
            if (turnTime == 4) {
                ny = y - dy[direction];
                nx = x - dx[direction];
                // 뒤로 갈 수 있다면 이동하기
                if (gameMap[ny][nx] == 0) {
                    y = ny;
                    x = nx;
                } else {    // 뒤가 바다로 막혀있는 경우
                    break;
                }
                turnTime = 0;
            }
        }
        System.out.println(count);
    }

    // 왼쪽으로 회전
    public static void turnLeft() {
        direction--;
        if (direction == -1) {
            direction = 3;
        }
    }
}
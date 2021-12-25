package chapter06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class PrintStudentLowToHigh {
    static class Student implements Comparable<Student> {
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Student other) {
            if (this.score < other.score) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int numOfStud = Integer.parseInt(br.readLine());

        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < numOfStud; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());

            students.add(new Student(name, score));
        }

        Collections.sort(students);

        for (Student student : students) {
            sb.append(student.getName()).append(" ");
        }
        System.out.println(sb);
    }
}

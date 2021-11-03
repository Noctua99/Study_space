package chapter33;

import java.util.ArrayList;
import java.util.List;

public class StudentFilterSample {
    public static void main(String[] args) {
        StudentFilterSample sample = new StudentFilterSample();

        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("요다", 43, 99, 10));
        studentList.add(new StudentDTO("만두", 30, 71, 85));
        studentList.add(new StudentDTO("건빵", 31, 82, 75));

//        sample.filterWithScoreForLoop(studentList, 80);
        sample.filterWithScoreStream(studentList, 80);
    }

    public void filterWithScoreForLoop(List<StudentDTO> studentList, int scoreCutLine) {
        for (StudentDTO student : studentList) {
            if (student.getScore() > scoreCutLine) {
                System.out.println(student.getName());
            }
        }
    }

    public void filterWithScoreStream(List<StudentDTO> studentList, int scoreCutLine) {
        studentList.stream().filter(student -> student.getScore() > scoreCutLine).forEach(student -> System.out.println(student.getName()));
    }
}

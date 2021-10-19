package chapter22_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ManageHeight {
    ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<>();

    public static void main(String[] args) {
        ManageHeight sample = new ManageHeight();
        sample.setData();
        for (int classNO = 1; classNO <= 5; classNO++) {
            sample.printHeight(classNO);
        }
        for (int classNO = 1; classNO <= 5; classNO++) {
            sample.printAverage(classNO);
        }
    }

    public void setData() {
        gradeHeights.add(new ArrayList<>(Arrays.asList(170, 180, 173, 175, 177)));
        gradeHeights.add(new ArrayList<>(Arrays.asList(160, 165, 167, 186)));
        gradeHeights.add(new ArrayList<>(Arrays.asList(158, 177, 187, 176)));
        gradeHeights.add(new ArrayList<>(Arrays.asList(173, 182, 181)));
        gradeHeights.add(new ArrayList<>(Arrays.asList(170, 180, 165, 177, 172)));
    }

    public void printHeight(int classNo) {
        System.out.println("Class No.:" + classNo);
        ArrayList<Integer> heights = gradeHeights.get(classNo - 1);
        for (Integer height : heights) {
            System.out.println(height);
        }
    }

    public void printAverage(int classNo) {
        System.out.println("Class No.:" + classNo);
        ArrayList<Integer> heights = gradeHeights.get(classNo - 1);
        int sum = 0;
        for (Integer height : heights) {
            sum += height;
        }
        double average = (double) sum / heights.size();
        System.out.println("Height average : " + average);
    }
}

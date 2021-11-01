package chapter30;

import java.util.ArrayList;
import java.util.Collections;

public class ReifiableSample {
    public static void main(String[] args) {

    }
    public void addData() {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        ArrayList<String> newDataList = new ArrayList<>();
        newDataList.add("a");
        Collections.addAll(list, newDataList);
        System.out.println(list);
    }
}

package chapter33;

import java.util.Arrays;
import java.util.List;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        sample.multiplyForClassic(intList);
//        sample.multiplyForWithStream(intList);
        sample.multiplyWithMap(intList);
    }

    private void multiplyForClassic(List<Integer> list) {
        for (int data : list) {
            System.out.println(data * 3);
        }
    }

    private void multiplyForWithStream(List<Integer> list) {
        list.forEach(value -> System.out.println(value * 3));
    }

    private void multiplyWithMap(List<Integer> list) {
        list.stream().map(x -> x * 3).forEach(System.out::println);
    }
}

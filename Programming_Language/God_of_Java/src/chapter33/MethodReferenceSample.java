package chapter33;

import java.util.Arrays;
import java.util.stream.Stream;

public class MethodReferenceSample {
    public static void main(String[] args) {
        MethodReferenceSample sample = new MethodReferenceSample();
        String[] stringArray = {"요다", "만두", "찐빵"};
        sample.staticReference(stringArray);
    }

    private static void printResult(String value) {
        System.out.println(value);
    }

    private void staticReference(String[] stringArray) {
        Stream.of(stringArray).forEach(MethodReferenceSample::printResult);
    }

    private void objectReference(String[] stringArray) {
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        Arrays.asList(stringArray).stream().forEach(System.out::println);
    }
}

package chapter23_practice;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    public static void main(String[] args) {
        RandomNumberMaker sample = new RandomNumberMaker();
        for (int i = 0; i < 10; i++) {
            System.out.println(sample.getSixNumber());
        }
    }

    public HashSet<Integer> getSixNumber() {
        Random random = new Random();
        HashSet<Integer> sixNumber = new HashSet<>();
        while (sixNumber.size() < 6) {
            int tempNumber = random.nextInt(45);
            sixNumber.add(tempNumber);
        }
        return sixNumber;
    }
}

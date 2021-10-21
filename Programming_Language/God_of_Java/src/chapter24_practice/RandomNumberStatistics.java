package chapter24_practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
    private final int DATA_BOUNDARY = 50;
    Hashtable<Integer, Integer> hashtable = new Hashtable<>();

    public static void main(String[] args) {
        RandomNumberStatistics sample = new RandomNumberStatistics();
        sample.getRandomNumberStatistics();
    }

    public void getRandomNumberStatistics() {
        Random random = new Random();
        int runCount = DATA_BOUNDARY * 100;
        for (int i = 0; i < runCount; i++) {
            putCurrentNumber(random.nextInt(50) + 1);
        }
        printStatistics();
    }

    public void putCurrentNumber(int tempNumber) {
        if (hashtable.containsKey(tempNumber)) {
            hashtable.put(tempNumber, hashtable.get(tempNumber) + 1);
        } else {
            hashtable.put(tempNumber, 1);
        }
    }

    public void printStatistics() {
        Set<Integer> keyset = hashtable.keySet();
        for (int tempkey : keyset) {
            System.out.print(tempkey + "=" + hashtable.get(tempkey) + " ");
            if (tempkey % 10 == 1) {
                System.out.println();
            }
        }
    }
}

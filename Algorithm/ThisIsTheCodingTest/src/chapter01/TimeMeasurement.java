package chapter01;

public class TimeMeasurement {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        double estimatedTime = (endTime - startTime) / 1000000000.0;
        System.out.println("estimatedTime : " + estimatedTime + "sec");
    }
}

package chapter25_practice;

public class TimerMain {
    public static void main(String[] args) {
        TimerThread thread = new TimerThread();
        thread.start();
    }
}

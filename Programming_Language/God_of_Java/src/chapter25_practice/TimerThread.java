package chapter25_practice;

import java.util.Date;

public class TimerThread extends Thread {
    public void run() {
        printCurrentTime();
    }

    public void printCurrentTime() {
        try {
            for (int loop = 0; loop < 10; loop++) {
                Date date = new Date();
                long currentTime = System.currentTimeMillis();
                System.out.println(date.toString() + " " + (currentTime - currentTime % 1000));
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

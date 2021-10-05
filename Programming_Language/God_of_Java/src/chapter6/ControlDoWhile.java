package chapter6;

public class ControlDoWhile {
    public static void main(String[] args) {
        ControlDoWhile control = new ControlDoWhile();
        control.doWhile();
    }

    public void doWhile() {
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;
        do {
            loop++;
            control.switchCalendar(loop);
        } while (loop < 12);
    }
}

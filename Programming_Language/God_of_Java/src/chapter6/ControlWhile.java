package chapter6;

public class ControlWhile {
    public static void main(String[] args) {
        ControlWhile control = new ControlWhile();
        control.whileLoop1();
        control.whileLoop2();
        control.whileBreak();
        control.whileContinue();
    }

    public void whileLoop1() {
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;
        while (loop < 12) {
            loop++;
            control.switchCalendar(loop);
        }
    }

    public void whileLoop2() {
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;
        while (loop < 12) {
            loop++;
            control.switchCalendar(loop);
            if (loop == 6) loop = 100;
        }
    }

    public void whileBreak() {
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;
        while (loop < 12) {
            loop++;
            control.switchCalendar(loop);
            if (loop == 6) break;
        }
    }

    public void whileContinue() {
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;
        while (loop < 12) {
            loop++;
            if (loop == 6) continue;
            control.switchCalendar(loop);
        }
    }

    public void whileContinueInfinit() {    // infinite loop
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;
        while (loop < 12) {
            if (loop == 6) continue;
            loop++;
            control.switchCalendar(loop);
        }
    }
}

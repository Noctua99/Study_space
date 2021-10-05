package chapter6;

public class ControlOfFlow {
    public static void main(String[] args) {
        ControlOfFlow control = new ControlOfFlow();
        for (int i = 1; i < 14; i++) {
            control.switchCalendar(i);
        }
    }

    public void switchCalendar(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + " has 31 days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + " has 30 days");
                break;
            case 2:
                System.out.println(month + " has 28 or 29 days");
                break;
            default:
                System.out.println(month + " is not a month");
                break;
        }
    }
}

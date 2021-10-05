package chapter6;

public class ControlLabel {
    public static void main(String[] args) {
        ControlLabel control = new ControlLabel();
        control.printTimesTable();
        control.printTimesTableSkip4Case1();
        control.printTimesTableSkip4Case2();
        control.printTimesTableSkipAfter4Case1();
    }

    public void printTimesTable() {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + " * " + j + " = " + i * j + " ");
            }
            System.out.println();
        }
    }

    public void printTimesTableSkip4Case1() {
        for (int i = 2; i < 10; i++) {
            if (i == 4) continue;
            for (int j = 1; j < 10; j++) {
                if (j == 4) continue;
                System.out.print(i + " * " + j + " = " + i * j + " ");
            }
            System.out.println();
        }
    }

    public void printTimesTableSkip4Case2() {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == 4 || j == 4) continue;
                System.out.print(i + " * " + j + " = " + i * j + " ");
            }
            System.out.println();
        }
    }

    public void printTimesTableSkipAfter4Case1() {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j > 3) break;
                System.out.print(i + " * " + j + " = " + i * j + " ");
            }
            System.out.println();
        }
    }

    public void printTimesTableSkipAfter4Case2() {
        startLabel:
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j > 3) continue startLabel;
                System.out.print(i + " * " + j + " = " + i * j + " ");
            }
            System.out.println();
        }
    }
}

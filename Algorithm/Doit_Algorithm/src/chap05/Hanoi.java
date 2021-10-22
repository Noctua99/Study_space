package chap05;

public class Hanoi {
    public static void main(String[] args) {
        Hanoi sample = new Hanoi();
        sample.move(3, 1, 3);
    }

    public void move(int no, int x, int y) {
        if (no > 1)
            move(no - 1, x, 6 - x - y);
        System.out.println(no + " " + x + " " + y);
        if (no > 1)
            move(no - 1, 6 - x - y, y);
    }
}

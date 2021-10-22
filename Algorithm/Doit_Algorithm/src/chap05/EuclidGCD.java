package chap05;

public class EuclidGCD {
    public static void main(String[] args) {
        EuclidGCD sample = new EuclidGCD();
        int num1 = 22;
        int num2 = 8;
        System.out.println("gcd(" + num1 + "," + num2 + ") is " + sample.gcdFor(num1, num2));
    }

    public int gcd(int x, int y) {
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

    public int gcdFor(int x, int y) {
        while (y != 0) {
            int temp = x;
            x = y;
            y = temp % y;
        }
        return x;
    }
}

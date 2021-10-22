package chap05;

public class Factorial {
    public static void main(String[] args) {
        Factorial sample = new Factorial();
        int num = 15;
        System.out.println(num + "의 팩토리얼은 " + sample.factorial(num) + "입니다");
    }

    public int factorial(int num) {
        if (num > 0) {
            return num * factorial(num - 1);
        } else {
            return 1;
        }
    }
}

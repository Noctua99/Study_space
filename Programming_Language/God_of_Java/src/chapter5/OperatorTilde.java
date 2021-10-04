package chapter5;

public class OperatorTilde {
    public static void main(String[] args) {
        OperatorTilde operator = new OperatorTilde();
        byte b = 127;   // 0111 1111
        operator.printTildeResult(b);
        b = 1;          // 0000 0001
        operator.printTildeResult(b);
    }

    public void printTildeResult(byte b) {
        System.out.println("Original value = " + b);
        System.out.println("Tilde value    = " + ~b);
    }
}

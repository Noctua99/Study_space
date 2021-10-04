package chapter5;

public class OperatorRemainder {
    public static void main(String[] args) {
        OperatorRemainder sample = new OperatorRemainder();
        sample.remainder();
    }

    public void remainder() {
        int intValue1 = 53;
        int intValue2 = 10;
        int result = intValue1 % intValue2;
        System.out.println(result);
    }
}

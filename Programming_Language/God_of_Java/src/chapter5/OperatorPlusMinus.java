package chapter5;

public class OperatorPlusMinus {
    public static void main(String[] args) {
        OperatorPlusMinus sample = new OperatorPlusMinus();
        sample.additive();
    }

    public void additive() {
        int intValue1 = 5;
        int intValue2 = 10;
        int result = intValue1 + intValue2;
        System.out.println(result);
        result = intValue2 - intValue1;
        System.out.println(result);
    }
}


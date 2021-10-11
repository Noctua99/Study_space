package chapter13;

public class FinalVariable {
    final int instanceVarialbe = 1;

    public void method(final int parameter) {
        final int localVariable;
        localVariable = 2;
//        localVariable = 3;
//        parameter = 4;
    }
}

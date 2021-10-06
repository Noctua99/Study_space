package chapter8;

public class ReferenceStatic {
    public static String name = "Min";

    public static void main(String[] args) {
        ReferenceStatic.staticMethod();
    }

    public static void staticMethod() {
        System.out.println("This is a staticMethod");
    }

    public static void staticMethodCallVariable() {
        System.out.println(name);
    }
}

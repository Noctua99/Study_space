package chapter7;

public class ArrayPrint {
    public static void main(String[] args) {
        ArrayPrint array = new ArrayPrint();
        array.printString();
        array.printPrimitiveArray();
    }

    public void printString() {
        System.out.println("string = " + new String[0]);
        System.out.println("array = " + new ArrayPrint[0]);
    }

    public void printPrimitiveArray() {
        System.out.println("byteArray = " + new byte[0]);
        System.out.println("shortArray = " + new short[0]);
        System.out.println("intArray = " + new int[0]);
        System.out.println("longArray = " + new long[0]);
        System.out.println("floatArray = " + new float[0]);
        System.out.println("doubleArray = " + new double[0]);
        System.out.println("charArray = " + new char[0]);
        System.out.println("booleanArray = " + new boolean[0]);
    }
}

package chapter20_practice;

public class NumberObject {
    public static void main(String[] args) {
        NumberObject sample = new NumberObject();
        sample.parseLong("r1204");
        sample.printOtherBase(1024);
    }

    public long parseLong(String data) {
        try {
            return Long.parseLong(data);
        } catch (NumberFormatException e) {
            System.out.println(data + " is not a number");
            return -1;
        }
    }

    public void printOtherBase(long value) {
        System.out.println("Original : " + value);
        System.out.println("Binary : " + Long.toBinaryString(value));
        System.out.println("Hex : " + Long.toHexString(value));
        System.out.println("Octal : " + Long.toOctalString(value));
    }
}

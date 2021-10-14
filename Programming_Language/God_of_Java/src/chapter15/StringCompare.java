package chapter15;

public class StringCompare {
    public static void main(String[] args) {
        StringCompare sample = new StringCompare();
        sample.checkString();
        sample.checkCompare();
        sample.checkCompareTo();
    }

    public void checkString() {
        String text = "대국민 모두 다 안녕하세요";
        System.out.println("text.length() = " + text.length());
        System.out.println("text.isEmpty() = " + text.isEmpty());
    }

    public void checkCompare() {
        String text = "Check value";
        String text2 = new String("Check value");
        if (text == text2) {
            System.out.println("'text == text2' result is same");
        } else {
            System.out.println("'text == text2' result is different");
        }
        if (text.equals("Check value")) {
            System.out.println("text.equals(text2) result is same");
        }

        String text3 = "check value";
        if (text.equalsIgnoreCase(text3)) {
            System.out.println("text.equalsIgnoreCase(text3) result is same");
        }
    }

    public void checkCompareTo() {
        String text = "a";
        String text2 = "b";
        String text3 = "c";
        System.out.println(text2.compareTo(text));
        System.out.println(text2.compareTo(text3));
        System.out.println(text.compareTo(text3));
    }
}

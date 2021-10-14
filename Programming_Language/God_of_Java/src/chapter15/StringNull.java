package chapter15;

public class StringNull {
    public static void main(String[] args) {
        StringNull sample = new StringNull();
        sample.nullCheck(null);
    }

    public boolean nullCheck(String text) {
        if (text == null) return true;
        else {
            int textLength = text.length();
            System.out.println(textLength);
            return false;
        }
    }
}

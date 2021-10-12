package chapter14;

public class ThrowSample {
    public static void main(String[] args) {
        ThrowSample sample = new ThrowSample();
        sample.throwException(13);
        try {
            sample.throwException2(13);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void throwException(int number) {
        try {
            if (number > 12) {
                throw new Exception("Number is over than 12");
            }
            System.out.println("Number is " + number);  // 실행되지 않는다
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void throwException2(int number) throws Exception {

        if (number > 12) {
            throw new Exception("Number is over than 12");
        }
        System.out.println("Number is " + number);  // 실행되지 않는다
    }

    public void multiThrows() throws NullPointerException, Exception {

    }
}
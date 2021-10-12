package chapter15;

public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convert();
        sample.convertUTF16();
    }

    public void convert() {
        try {
            String korean = "한글";

            byte[] array1 = korean.getBytes();
            printByteArray(array1);
            String korean2 = new String(array1);
            System.out.println(korean2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void convertUTF16() {
        try {
            String korean = "자바의 신 최고!!!";
            byte[] array1 = korean.getBytes("UTF-16");
            printByteArray(array1);
            String korean2 = new String(array1,"UTF-16");   // byte 배열로 생성할 때 사용한 캐릭터 셋을 동일하게 사용해야 한다
            System.out.println(korean2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printByteArray(byte[] array) {
        for (byte data : array) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
}

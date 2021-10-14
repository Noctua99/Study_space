package chapter16_practice;

public class MyPage {
    InputBox input;

    public static void main(String[] args) {
        MyPage sample = new MyPage();
        sample.setUI();
        sample.pressKey();
    }

    public void setUI() {
        input = new InputBox();
        input.setKeyListener(new KeyEventListener() {
            @Override
            public void onKeyDown() {
                System.out.println("Key Down");
            }

            @Override
            public void onKeyUp() {
                System.out.println("Key Up");
            }
        });
    }

    public void pressKey() {
        input.listenerCalled(2);
        input.listenerCalled(4);
    }
}

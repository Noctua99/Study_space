package chapter33;

public class LambdaSample {
    public static void main(String[] args) {
        LambdaSample sample = new LambdaSample();
        sample.calculateClassic();
        sample.calculateLambda();
    }

    private void calculateClassic() {
        Calculate calculateAdd = new Calculate() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(calculateAdd.operation(1, 2));
    }

    private void calculateLambda() {
        Calculate calculateAdd = (a, b) -> a + b;
        System.out.println(calculateAdd.operation(1, 2));

        Calculate calculateSub = (a, b) -> a - b;
        System.out.println(calculateSub.operation(1, 2));
    }

    private void runCommonThread() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        new Thread(runnable).start();
    }

    private void runThread() {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }).start();
    }

    private void runThreadSimple() {
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }
}

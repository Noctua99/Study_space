package chapter04;

public class FindTime {
    public static void main(String[] args) {
        int input = 5;

//        1
        int count = 0;
        for (int h = 0; h <= input; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    String str = "" + h + m + s;
                    if (str.contains("3")) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);


//        2
        /*int sum = 0;
        for (int i = 0; i <= input; i++) {
            if (i == 3 || i == 13) {
                sum += 3600;
            } else {
                sum += 1575;
            }
        }
        System.out.println(sum);*/
    }
}

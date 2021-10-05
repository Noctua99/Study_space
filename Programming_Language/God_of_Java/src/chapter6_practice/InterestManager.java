package chapter6_practice;

public class InterestManager {
    public static void main(String[] args) {
        InterestManager manager = new InterestManager();
        for (int i = 5; i < 366; i += 10) {
            System.out.println("day " + i + " : " + manager.calculateAmount(i, 1000000));
        }
    }

    public double getInterestRate(int day) {
        if (day <= 90) {
            return (0.5 / 100);
        } else if (day <= 180) {
            return (1.0 / 100);
        } else if (day <= 364) {
            return (2.0 / 100);
        } else {
            return (5.6 / 100);
        }
    }

    public double calculateAmount(int day, long amount) {
        return (amount + getInterestRate(day) * amount * day / 365);
    }
}

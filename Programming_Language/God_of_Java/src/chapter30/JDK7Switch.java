package chapter30;

public class JDK7Switch {
    public static void main(String[] args) {
        JDK7Switch switchSample = new JDK7Switch();
        System.out.println(switchSample.salaryIncreaseAmount(3));
        System.out.println(switchSample.salaryIncreaseAmount("Engineer"));

    }

    public double salaryIncreaseAmount(int employeeLevel) {
        switch (employeeLevel) {
            case 1: // CEO
                return 10.0;
            case 2: // Manager
                return 15.0;
            case 3: // Engineer, Developer
                return 100.0;
            case 4: // Designer, Planner
                return 20.0;
        }
        return 0.0;
    }

    public double salaryIncreaseAmount(String employeeLevel) {
        switch (employeeLevel) {
            case "CEO":
                return 10.0;
            case "Manager":
                return 15.0;
            case "Engineer":
            case "Developer":
                return 100.0;
            case "Designer":
            case "Planner":
                return 20.0;
        }
        return 0.0;
    }
}

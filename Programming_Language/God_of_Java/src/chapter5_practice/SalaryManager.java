package chapter5_practice;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager manager = new SalaryManager();
        System.out.println("real monthly salary : " + manager.getMonthlySalary(20000000));
    }

    public double getMonthlySalary(int yearlySalary) {
        double monthlySalary = yearlySalary / 12.0;
        System.out.println("monthly salary : " + monthlySalary);

        double tax = calculateTax(monthlySalary);
        double pension = calculatorNationalPension(monthlySalary);
        double insurance = calculateHealthInsurance(monthlySalary);
        System.out.println("tax : " + tax);
        System.out.println("national pension : " + pension);
        System.out.println("health insurance : " + insurance);

        double total = tax + pension + insurance;

        monthlySalary -= total;

        return monthlySalary;
    }

    public double calculateTax(double monthlySalary) {
        return monthlySalary * 0.125;
    }

    public double calculatorNationalPension(double monthlySalary) {
        return monthlySalary * 0.081;
    }

    public double calculateHealthInsurance(double monthlySalary) {
        return monthlySalary * 0.135;
    }
}

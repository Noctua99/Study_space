package chapter13_practice;

public class HealthInsuranceManager {
    public static void main(String[] args) {
        int salaryArray[] = new int[]{1500, 5500, 8000};
        HealthInsurance[] insurances = new HealthInsurance[3];
        insurances[0] = HealthInsurance.getHealthInsurance(salaryArray[0]);
        insurances[1] = HealthInsurance.getHealthInsurance(salaryArray[1]);
        insurances[2] = HealthInsurance.getHealthInsurance(salaryArray[2]);

        for (int loop = 0; loop < 3; loop++) {
            System.out.println(salaryArray[loop] + " = " + insurances[loop] + ", " + insurances[loop].getRatio());
        }
    }
}

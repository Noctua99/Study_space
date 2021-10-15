package midterm_exam;

public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary salary = new CalculateSalary();
        salary.calculateSalaries();
    }

    public long getSalaryIncrease(Employee employee) {
        switch (employee.getType()) {
            case 1:
                return employee.getSalary() * 5 / 100;
            case 2:
                return employee.getSalary() * 110 / 100;
            case 3:
                return employee.getSalary() * 120 / 100;
            case 4:
                return employee.getSalary() * 130 / 100;
            case 5:
                return employee.getSalary() * 200 / 100;
            default:
                return 0;
        }
    }

    public void calculateSalaries() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("LeeDaeRi", 1, 1000000000L);
        employees[1] = new Employee("KimManager", 2, 100000000L);
        employees[2] = new Employee("WhangDesign", 3, 70000000L);
        employees[3] = new Employee("ParkArchi", 4, 80000000L);
        employees[4] = new Employee("LeeDevelop", 5, 60000000L);

        for (Employee employee : employees) {
            System.out.println(employee.getName() + "'s increased salary is " + getSalaryIncrease(employee) + "won");
        }
    }
}

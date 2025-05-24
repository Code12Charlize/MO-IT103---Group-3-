public class Salary {

    // Please note that all details are only examples

    int id;
    String details;
    String calculation;

    public float calculateSalary() {

        float salary = 30000.00f; // Sample Salary
        float salaryDeduction = salary * 0.10f; // 10% Sample salaryDeduction
        float salaryAllowance = salary * 0.15f; // 15% salaryAllowance

        return salary - salaryDeduction + salaryAllowance; // returns total salary

    }

    public void updateSalary() {

    }

}

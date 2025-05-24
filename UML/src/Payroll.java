public class Payroll {

    // Please note all details are examples only

    private float basicSalary;
    private float allowances;
    private float deductions;

    // Constructor
    public Payroll(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float generatePayslip() {
        // Calculate standard allowances (example: 20% of basic salary)
        this.allowances = basicSalary * 0.20f;

        // In a real system, you would print or save the payslip details here
        System.out.println("=== PAYSLIP ===");
        System.out.printf("Basic Salary: $%.2f%n", basicSalary);
        System.out.printf("Allowances: $%.2f%n", allowances);
        System.out.printf("Deductions: $%.2f%n", deductions);
        System.out.printf("Net Salary: $%.2f%n", calculateNetSalary());

        return basicSalary + allowances; // Returns gross pay
    }

    public float calculateNetSalary() {
        // Example standard deductions (tax, SSS, etc.)
        float tax = basicSalary * 0.15f; // 15% tax
        float sss = 800.00f; // Fixed SSS contribution
        float philhealth = 400.00f; // Fixed PhilHealth

        this.deductions = tax + sss + philhealth;
        float grossPay = basicSalary + allowances;

        return grossPay - deductions;
    }

    // Getters and setters
    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public float getAllowances() {
        return allowances;
    }

    public float getDeductions() {
        return deductions;
    }

}

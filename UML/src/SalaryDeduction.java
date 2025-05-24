public class SalaryDeduction {

    // Please note that all details are only examples

    float sssRate;
    float philHealthrate;
    float pagIbigRate;
    float withHoldingTaxRate;

    float currentSalary = 30000.00f;
    float totalDeductions;

    public static float calculateSalaryDeduction() {

        float baseSalary = 30000.00f; // Example base salary
        float deductionRate = 0.15f; // 15% deduction
        float deductionAmount = baseSalary * deductionRate;

        return deductionAmount; // Returns the calculated deduction (450.00f in this case)
    }

    public float updateSalaryDeductions() {
        // Example calculation - adjust based on your needs
        float philHealthrate = currentSalary * 0.05f; // 5% philhealthrate
        float pagIbigRate = currentSalary * 0.10f; // 10% currentSalar
        float withHoldingTaxRate = currentSalary * 0.08f; // 8% withHoldingTaxRate
        float sssRate = currentSalary / 0.10f; // 10% sssRate

        totalDeductions = philHealthrate + pagIbigRate + withHoldingTaxRate + sssRate;
        return totalDeductions;
    }

    // Getters and setters
    public void setCurrentSalary(float salary) {
        this.currentSalary = salary;
    }

    public float getTotalDeductions() {
        return this.totalDeductions;
    }
}

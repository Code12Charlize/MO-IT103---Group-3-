public class Allowance {

    // Please note that all details are only examples

    float riceSubsidy;
    float phoneAllowance;
    float clothingAllowance;
    float currentSalary = 30000.00f;
    float totalAllowance;
    private float baseSalary;
    private float currentAllowance;

    public static float calculateSalaryAllowance() {

        float baseSalary = 30000.00f; // Example base salary
        float allowancePercentage = 0.12f; // 12% allowance
        return baseSalary * allowancePercentage; // Returns 3000.00f

    }

    // Updates and returns the salary allowance (e.g., 10% of base salary)
    public float updateSalaryAllowance() {
        float riceSubsidy = baseSalary * 0.10f; // 10% riceSubsidy
        float phoneAllowance = 0.08f; // 8% phoneAllowance
        float clothingAllowance = 0.05f; // 5% clothingAllowance

        this.currentAllowance = baseSalary + riceSubsidy + phoneAllowance + clothingAllowance;
        return this.currentAllowance;
    }

    // Setter for baseSalary (required to use this method)
    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

}

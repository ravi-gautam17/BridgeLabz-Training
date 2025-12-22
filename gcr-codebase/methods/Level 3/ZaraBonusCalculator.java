public class ZaraBonusCalculator {
        public static void main(String[] args) {
        // Step 1: Initialize employee data (Salary and Years of Service)
        double[][] employeeData = generateEmployeeData(10);

        // Step 2: Calculate Bonuses and New Salaries
        double[][] results = calculateBonuses(employeeData);

        // Step 3: Calculate totals and display results in a Tabular Format
        displayResults(employeeData, results);
    }

    /**
     * Generates random 5-digit salaries and years of service (0-10) for 10 employees.
     * Stores them in a 2D Array: [row][0] = Salary, [row][1] = Years
     */
    public static double[][] generateEmployeeData(int count) {
        double[][] data = new double[count][2];
        for (int i = 0; i < count; i++) {
            // Generates a 5-digit salary between 10,000 and 99,999
            data[i][0] = (Math.random() * 90000) + 10000;
            // Generates years of service between 0 and 10 (company age)
            data[i][1] = (int)(Math.random() * 11);
        }
        return data;
    }

    /**
     * Calculates the bonus and new salary based on Zara's policy.
     * Zara gives 5% for > 5 years, and 2% for <= 5 years.
     * Returns 2D Array: [row][0] = New Salary, [row][1] = Bonus Amount
     */
    public static double[][] calculateBonuses(double[][] data) {
        double[][] results = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double oldSalary = data[i][0];
            double years = data[i][1];
            double bonusPercent = (years > 5) ? 0.05 : 0.02;

            double bonusAmount = oldSalary * bonusPercent;
            results[i][0] = oldSalary + bonusAmount; // New Salary
            results[i][1] = bonusAmount;             // Bonus Amount
        }
        return results;
    }

    /**
     * Calculates totals and displays everything in a clean table.
     */
   public static void displayResults(double[][] oldData, double[][] newData) {
    double totalOld = 0, totalBonus = 0, totalNew = 0;

    System.out.println("\nEmp# | Old Salary | Years | Bonus | New Salary");
    
    for (int i = 0; i < oldData.length; i++) {
        double oldSal = oldData[i][0];
        double years  = oldData[i][1];
        double bonus  = newData[i][1];
        double newSal = newData[i][0];

        // Sum the totals
        totalOld += oldSal;
        totalBonus += bonus;
        totalNew += newSal;

        // Simple concatenation display
        System.out.println((i + 1) + " | " + oldSal + " | " + years + " | " + bonus + " | " + newSal);
    }

    System.out.println("--------------------------------------------------");
    System.out.println("TOTALS: Old: " + totalOld + " | Bonus: " + totalBonus + " | New: " + totalNew);
}
}

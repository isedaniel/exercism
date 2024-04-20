public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return (daysSkipped >= 5) ? .85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        return (productsSold >= 12) ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double base = 1000;
        return base * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
    } 
}

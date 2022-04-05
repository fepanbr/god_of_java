package chap05;

public class SalaryManager {
  public static void main(String[] args) {
    SalaryManager manager = new SalaryManager();
    System.out.println(manager.getMonthlySalary(20000000));
  }

  public double getMonthlySalary(int yealySalary) {
    return (yealySalary / 12.0)
        - this.calculateTax(yealySalary / 12.0)
        - this.calculateNationalPension(yealySalary / 12.0)
        - this.calculateHealthInsurance(yealySalary / 12.0);
  }

  public double calculateTax(double monthlySalary) {
    double result = 0.0;

    result = monthlySalary * 0.125;
    System.out.println("근로 소득세는?" + result);
    return result;
  }

  public double calculateNationalPension(double monthSalary) {
    return monthSalary * 0.081;
  }

  public double calculateHealthInsurance(double monthSalary) {
    return monthSalary * 0.135;
  }
}

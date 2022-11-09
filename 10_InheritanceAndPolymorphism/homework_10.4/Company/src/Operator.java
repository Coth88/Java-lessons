public class Operator implements Employee {
  private  Company company;

  private int salary = (int) (Math.random() * 50000) + 50000;

  public Operator(Company company) {
    this.company = company;
  }

  @Override
  public int getMonthSalary() {
    return salary;
  }
}
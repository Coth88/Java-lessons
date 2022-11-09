public class Manager implements Employee {

  private int salary = (int) (Math.random() * 70000) + 70000;
  private int sales;
  private  Company company;

  public int getSales() {
    return sales;
  }


  public Manager(Company company) {
    this.company = company;
    sales = (int) (Math.random() * (140000 - 115000) + 115000);
    salary += sales * 0.05;
  }

  @Override
  public int getMonthSalary() {
    return salary;
  }
}

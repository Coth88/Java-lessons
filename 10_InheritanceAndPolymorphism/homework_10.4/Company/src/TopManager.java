public class TopManager implements Employee {

  private int salary = (int) (Math.random() * 100000) + 100000;
  private  Company company;

  public TopManager(Company company){
    this.company = company;

  }

  @Override
  public int getMonthSalary() {
    if (company.getIncome() > 10000000)
    return (int) (salary * 1.5);
    else return salary;
  }

}

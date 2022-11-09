import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Company company = new Company();
    List<Employee> workers = new ArrayList<>();
    for (int i = 0; i < 180; i++) {
      workers.add(new Operator(company));
    }
    for (int i = 0; i < 80; i++) {
      workers.add(new Manager(company));
    }
    for (int i = 0; i < 10; i++) {
      workers.add(new TopManager(company));
    }
    company.hireAll(workers);
    System.out.println("Самые высокие зарплаты:");
    List<Employee> topSalaryStaff = company.getTopSalaryStaff(15);
    for (Employee e : topSalaryStaff) {
      System.out.println(e.getMonthSalary());
    }
    System.out.println();

    System.out.println("Самые низкие зарплаты:");
    List<Employee> LowSalaryStaff = company.getLowestSalaryStaff(30);
    for (Employee e : LowSalaryStaff) {
      System.out.println(e.getMonthSalary());
    }

    List<Employee> employees = company.getEmployees();
    for (int i = 0; i < 135; i++) {
      company.fire(employees.get(i));
    }
    System.out.println();
    System.out.println("уволено 50% сотрудников:");
    printEmployees(company);
  }

  private static void printEmployees(Company company) {
    System.out.println("Самые высокие зарплаты:");
    List<Employee> topSalaryStaff = company.getTopSalaryStaff(15);
    for (Employee e : topSalaryStaff) {
      System.out.println(e.getMonthSalary());
    }
    System.out.println();
    System.out.println("Самые низкие зарплаты:");
    List<Employee> LowSalaryStaff = company.getLowestSalaryStaff(30);
    for (Employee e : LowSalaryStaff) {
      System.out.println(e.getMonthSalary());
    }
  }
}

package poly;

public class EmployeeEx {

  public static void main(String[] args) {
    Employee employee = new Employee("Brian", "PM");
    work(employee);

    // employee = new Ceo("Emily", "President");
    // employee.work();
    Ceo ceo = new Ceo("Emily", "President");
    work(ceo);

    // employee = new Admin("Donovin", "Manager");
    // employee.work();
    Admin admin = new Admin("Donovin", "Manager");
    work(admin);

    // employee = new PartTime("Ricardo", "Parttimejob");
    // employee.work();
    PartTime partTime = new PartTime("Ricardo", "Parttimejob");
    work(partTime);
  }

  public static void work(Employee e) {
    e.work();
  }
}

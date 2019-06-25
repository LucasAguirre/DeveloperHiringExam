import java.util.Date;

public class Employee extends Person {

  private EmployeeType eType;

  public Employee(String lastName, String firstName, Date birthDate, long id, EmployeeType eType) {
    super(lastName, firstName, birthDate, id);
    this.eType = eType;
  }

  public enum EmployeeType {
    TEACHER,
    JANITOR,
    PRINCIPAL;
  }
}

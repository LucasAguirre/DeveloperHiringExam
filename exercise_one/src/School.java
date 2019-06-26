import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class School {
  private Employee principal;
  private List<Employee> employees;
  private List<Student> students;

  public School() {
    principal = null;
    employees = new ArrayList<>();
    students = new ArrayList<>();
  }

  public Employee getPrincipal() {
    return principal;
  }

  public void setPrincipal(Employee principal) {
    this.principal = principal;
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

  public void addEmployee(Employee employee) {
    if (!employees.contains(employee)) {
      employees.add(employee);
    }
  }

  public List<Student> getAllStudents() {
    return students;
  }

  public Map<Character, List<Student>> listStudents() {
    Map<Character, List<Student>> studentMap = new HashMap<>();
    for (Student student : students) {
      if (!studentMap.containsKey(student.getLastName().charAt(0))) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentMap.put(student.getLastName().charAt(0), studentList);
      } else {
        studentMap.get(student.getLastName().charAt(0)).add(student);
      }
    }

    return studentMap;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  public void addStudent(Student student) {
    if (!students.contains(student)) {
      students.add(student);
    }
  }

  public List<Student> getCourse(String subject) {
    return students.stream().filter(student -> student.isSubscribedToSubject(subject)).collect(Collectors.toList());
  }

}

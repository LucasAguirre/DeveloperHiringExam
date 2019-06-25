import java.util.List;

public class Subject {
  private String name;
  private List<Student> students;
  private Employee teacher;

  public Subject(String name) {
    this.name = name;
  }

  public void removeStudent(String lastName, String firstName) {
    students.stream().forEach((student) -> {
      if (student.getLastName().equals(lastName) && student.getFirstName().equals(firstName))
        students.remove(student);
    });
  }

  public void removeStudent(Student student) {
    students.remove(student);
  }

  public void addStudent(Student student) {
    if (!students.contains(student))
      students.add(student);
  }

  public List<Student> getAllStudents() {
    return this.students;
  }

  public Employee getTeacher() {
    return this.teacher;
  }

  public void setTeacher(Employee teacher) {
    this.teacher = teacher;
  }
}
import java.util.Date;

public abstract class Person implements Comparable<Person> {
  private String lastName;
  private String firstName;
  private Date birthDate;
  private long id;

  public Person(String lastName, String firstName, Date birthDate, long id) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.birthDate = birthDate;
    this.id = id;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public long getId() {
    return id;
  }

  @Override
  public boolean equals(Object person) {
    return this.lastName.equals(((Person) person).getLastName()) && this.firstName.equals(((Person) person).getFirstName()) && this.id == (((Person) person).getId());
  }

  @Override
  public int compareTo(Person person) {
    return (this.lastName.compareTo(person.getLastName()) == 0) ? this.firstName.compareTo(person.getFirstName()) : this.lastName.compareTo(person.getLastName());
  }
}

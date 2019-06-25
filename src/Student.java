import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends Person {

  private List<String> subjects;
  public Student(String lastName, String firstName, Date birthDate, long id) {
    super(lastName, firstName,birthDate, id);
    subjects = new ArrayList<>();
  }

  public void subscribeToSubject(String subject){
    if(!subjects.contains(subject)){
      subjects.add(subject);
    }
  }

  public void unsubscribeToSubject(String subject){
    if(subjects.contains(subject)){
      subjects.remove(subject);
    }
  }

  public List<String> getSubjects(){
    return subjects;
  }

  public boolean isSubscribedToSubject(String subject){
    return subjects.contains(subject);
  }
}

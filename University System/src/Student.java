import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    List<Grade> grades = new ArrayList<>();

    String Facnum;
    String Id;

    public Student(String username, String password, String Facnum, String Id) {
        super(username, password);
        this.grades = grades;
        this.Facnum = Facnum;
        this.Id = Id;
    }
}

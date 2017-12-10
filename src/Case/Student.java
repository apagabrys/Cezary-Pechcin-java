package Case;

import java.util.ArrayList;
import java.util.List;

public class Student extends Human{
    private static List<Student> studentsCollection = new ArrayList<>();
    private static int studentsCounter = 0;
    public Student(String firstName, String secondName) {
        super(firstName, secondName);
        studentsCounter++;
        studentsCollection.add(this);
    }

    public static List<Student> getStudentsCollection() {
        return studentsCollection;
    }
}

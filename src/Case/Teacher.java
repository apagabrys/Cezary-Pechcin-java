package Case;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Human{
    private static List<Teacher> teachersCollection = new ArrayList<>();
    private static int teachersCounter = 0;
    private static Subject subject;
    public Teacher(String firstName, String lastName, Subject subject) {
        super(firstName, lastName);
        this.subject=subject;
        teachersCounter++;
        teachersCollection.add(this);
    }

    public static List<Teacher> getTeachersCollection() {
        return teachersCollection;
    }

    public Subject getSubject() {
        return subject;
    }
}

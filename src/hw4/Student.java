package hw4;

import java.util.ArrayList;
import java.util.List;

public class Student extends Human {
    private String faculty;
    private static List<Student> studentsCollection = new ArrayList<>();
    private static int studentsCounter = 0;

    public Student(String firstName, String secondName, String pesel, String faculty) {
        super(firstName, secondName, pesel);
        studentsCounter++;
        studentsCollection.add(this);
        this.faculty = faculty;
    }


    public String getFaculty() {
        return faculty;
    }

    public static List<Student> getStudentsCollection() {
        return studentsCollection;
    }

    public static int getStudentsCounter() {
        return studentsCounter;
    }

    @Override
    public boolean equals(Object o){
        final Student s = (Student) o;
        return (super.getFirstName() == s.getFirstName()) && (super.getSecondName() == s.getSecondName()) &&
                (super.getPesel() == s.getPesel());
    }
    public int hashCode(){
        return Integer.parseInt(super.getPesel().substring(0, 5));
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getSecondName() + " o numerze PESEL: " + getPesel()+ " studiujący na kierunku " + getFaculty();
    }
}

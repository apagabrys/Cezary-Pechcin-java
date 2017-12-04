package hw4;

import java.util.ArrayList;
import java.util.List;

public class Student extends Human {
    private String faculty;
    private List<Student> students = new ArrayList<>();
    public Supervisor supervisor;

    public Student(String firstName, String secondName, String pesel, String faculty) {
        super(firstName, secondName, pesel);
        this.faculty = faculty;
        this.supervisor = supervisor;
        students.add(this);
    }
    public Supervisor getSupervisor(){
        return supervisor;
    }

    public String getFaculty() {
        return faculty;
    }

    public List<Student> getStudents() {
        return students;
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
        return getFirstName() + " " + getSecondName() + " o numerze PESEL: " + getPesel()+ " studiujący na kierunku " + getFaculty()+
        " jest u promotora " + getSupervisor();
    }
}

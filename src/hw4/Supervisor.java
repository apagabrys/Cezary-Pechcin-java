package hw4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Supervisor extends Human {

   public Supervisor(String firstName, String secondName, String pesel) {
            super(firstName, secondName, pesel);
   }

    public List<Student> supervisorStudents = new ArrayList<Student>();

    public void addStudent(Student student){
            supervisorStudents.add(student);
        System.out.println(supervisorStudents);
    }

    @Override
    public String toString() {
        return getFirstName() +" "+ getSecondName()+" o numerze pesel: "+ getPesel()+ " ";
    }
}

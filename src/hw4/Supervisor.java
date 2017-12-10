package hw4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Supervisor extends Human {
    private static List<Supervisor> supervisorsCollection = new ArrayList<>();
    private static int supervisorsCounter = 0;

   public Supervisor(String firstName, String secondName, String pesel) {
       super(firstName, secondName, pesel);
       supervisorsCounter++;
       supervisorsCollection.add(this);
   }

    public static List<Supervisor> getSupervisorsCollection() {
        return supervisorsCollection;
    }

    public static int getSupervisorsCounter() {
        return supervisorsCounter;
    }

    public List<Student> supervisorStudents = new ArrayList<Student>();

    public void addStudent(Student student){
            supervisorStudents.add(student);
        System.out.println(supervisorStudents);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Supervisor that = (Supervisor) o;

        return supervisorStudents.equals(that.supervisorStudents);
    }
    @Override
    public int hashCode(){
        return Integer.parseInt(super.getPesel().substring(0, 5));
    }

    @Override
    public String toString() {
        return getFirstName() +" "+ getSecondName()+" o numerze pesel: "+ getPesel()+ " ";
    }
}

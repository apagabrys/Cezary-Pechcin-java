package hw4;

import java.util.HashMap;
import java.util.Map;

public class Signer {
    HashMap<Supervisor, Student> signer = new HashMap<>();
    public void addStudentToSupervisor(Supervisor supervisor, Student student) {
        signer.put(supervisor, student);
        System.out.println("Studenciak " + student + " został zapisany do promotora: " + supervisor);
    }
    public void showAddedStudents(){
        for(Map.Entry<Supervisor, Student> entry :signer.entrySet()){
            System.out.println("Do promotora: " + entry.getKey() + " są zapisani " + entry.getValue() + " ");
        }
    }

}

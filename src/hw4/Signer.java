package hw4;

public class Signer {
    Supervisor supervisor;
    Student student;
    public void addStudentToSupervisor(Student student){
        supervisor.addStudent(student);
        System.out.println();
    }

}

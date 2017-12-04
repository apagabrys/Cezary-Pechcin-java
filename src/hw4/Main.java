package hw4;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Czaro", "Pieczaro", "123472819281", "Economics");
        Student student2 = new Student("Adam", "Nowak", "12324", "Mathematics");
        Student student3 = new Student("Maciej", "Kawaler", "1232133", "Logistics");
        Student student4 = new Student("Olek", "Boelk", "12312313", "Literature");
        Supervisor supervisor1 = new Supervisor("Pan", "Promotor", "2121212121");
        Supervisor supervisor2 = new Supervisor("Adam", "Profesor", "213231312");
        Supervisor supervisor3 = new Supervisor("Tomasz", "Wykladowca", "9283718231");

        supervisor1.addStudent(student4);
        supervisor1.addStudent(student1);








    }
}

package was3;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private String name;
    private int age;
    private double weight;
    private static List<Animal> animalList = new ArrayList<>(); // ctrl i myszka na coś i sprawdź co to kurwa jest xD

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    Animal(){
        this.name="Max";
        this.age=5;
        this.weight=5;
        System.out.println(this.name+" został stworzony.");
        animalList.add(this);
    }

    Animal(String name, int age, double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
        System.out.println(this.name+" został stworzony.");
        animalList.add(this);
    }

    public static List<Animal> getAnimalList() {
        return animalList;
    }


    public void makeSound(){};

    public String toString(){
        return this.name + " ma " + this.age + " lat ";
    }


}

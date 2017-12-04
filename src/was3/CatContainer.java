package was3;

import java.util.ArrayList;
import java.util.List;

public class CatContainer {
    CatContainer(){}
    private static List<Cat> catList = new ArrayList<>();
    public void addCat(String name, int age, double weight){
        if(name!=null && age>0 && weight >0){
            catList.add(new Cat(name,age,weight));
        } else {
            System.out.println("Niepoprawne dane! XXX");
        }
    }

    public static List<Cat> getCatList() {
        return catList;
    }

    public class Cat extends Animal{

        Cat(){
            super();
        }

        Cat(String name, int age, double weight){
            super(name, age, weight);
        }
        @Override
        public void makeSound(){
            System.out.println(super.getName()+": Miau");
        }
    }
}

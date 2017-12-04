package was3;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {
    private Breed breed;
    private boolean canSit;
    private boolean canFetch;
    private static int dogsCounter = 0;
    private static List<Dog> dogCollection = new ArrayList<>();

    public Dog(String name, int age, double weight, Breed breed) {
        super(name, age, weight);
        this.breed = breed;
        this.canSit = false;
        this.canFetch = false;
   //     System.out.println(super.getName() + " został stworzony.");
        dogsCounter++;
        dogCollection.add(this);
    }

  /*  public void Sit(){
        if(canSit){
            System.out.println(this.name+" usiadł");
        } else {
            System.out.println(this.name+" nie zna tej komendy");
        }
    }

    public void learnSit(){
        this.canSit = true;
    }

    public void learnFetch(){
        this.canFetch = true;
    }

    public String Fetch(){
        if (canFetch){
           return this.name+" zaaportował";
     }
      // else {
           return this.name+ "nie umia paanie!";
     //   }
    }
*/
    public static List<Dog> getDogCollection() {
        return dogCollection;
    }

    public static int getDogsCounter() {
        return dogsCounter;
    }


    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return breed + " imieniem " + super.getName() + " ma lat "+ super.getAge();
    }
    @Override
    public void makeSound(){
        System.out.println(super.getName()+": Hau");
    }
}

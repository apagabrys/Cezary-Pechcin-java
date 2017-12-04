package was3;

public class Main {
    public static void main(String[] args) {

        /*
        Punkt punkt = new Punkt();
        punkt.setX(5);
        punkt.setY(5);
        System.out.println(punkt.getX());

        punkt.przesunOAB(2,3);
        System.out.println("Nowe współrzędne: " + punkt.getX()+","+punkt.getY());


        Dog dog = new Dog("Luna", 1, Breed.POODLE);
        int b = 5;
        System.out.println(b);
        System.out.println(dog);
        dog.setName("Max");
        System.out.println(dog);

        dog.Sit();
        dog.learnSit();
        dog.Sit();

        dog.learnFetch();
        System.out.println(dog.Fetch());

        Dog dog1 = new Dog("Puszek", 2, Breed.PUG);
        System.out.println("Stworzono psów " + Dog.getDogsCounter());

        //learnSit();

        System.out.println("Stworzono psów: "+Dog.getDogCollection().size());

        for (Dog d:Dog.getDogCollection()) {
            if(d.getBreed()==Breed.PUG){
                System.out.println("Znaleziono Mopsa: "+d.getName());
            }
        }*/
      //  Animal a = new Animal();
      //  System.out.println(a);

        Dog d = new Dog("Max", 5, 5, Breed.PUG);
        System.out.println(d);

     /*   Cat c = new Cat();
        System.out.println();

        Cat c2 = new Cat("Mruczek", 5, 5);
        System.out.println(c2);
        c2.makeSound();
        d.makeSound();

        Animal zwierz = new Cat();

        for (int i=0; i<=30; i++){
            if(i%2==0){
                Cat b = new Cat("Cat"+i,5, 2);
            } else {
                Dog b = new Dog("Dog"+i, 4,1,Breed.PUG);
            }
        }*/
        System.out.println(Animal.getAnimalList().size());

        for (Animal a:Animal.getAnimalList()){
            if (a instanceof Dog) {
                System.out.println("Jestem psem");
            }
        }

        Dog pies = new Dog(null,-5,-2,null);
        System.out.println(pies);

        CatContainer catContainer = new CatContainer();
        catContainer.addCat("Mruczek",2,2);
        System.out.println(CatContainer.getCatList().size());

    }
}

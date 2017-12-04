public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte b = 10; // (-128 127) tylko całkowite 1 bajt
        short s = 300; // (-32768 32767) 2 bajtów całk
        int i = 1000;
        long l = 2000; //tylko całkowite.

        float f = 3.14f; // typy zmiennoprzecinkowe
        double d = 3.14d;

        char c = 'c';
        String pierwszyNapis = "Pierwsze zdanie";

        /*System.out.println("Nasz double wynosi: " + d);
        System.out.println(d);
        System.out.println("Moje imię to No one");*/

        //Operatory + - * / %
        int num1 = 50/2;
        int num2 = 10*3;
        int num3 = num1-num2;
        int num4 = 5%3;
        System.out.println("\n1 liczba: " + num1 + "\n2 liczba: " + num2 + "\n3 liczba: " + num3 + "\n4 liczba: " + num4);
        System.out.println(5/3);
        double de = 1.0*5/3;
        System.out.println(de);

        char literka = 'e'; // ASCII a=97 A=65
        System.out.println(literka + 1); // ASCII e=101

        // ZADANIE Zamień dużą litrę na małą
        char lit = 'c'-32; // Zawsze różnica pomiędzy małą a wielką to 32
        System.out.println(lit);

        // Operatory logiczne == && || !=
        boolean p = 10!=3;
        System.out.println(p);

    }
}

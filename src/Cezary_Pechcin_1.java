import java.util.Scanner;

public class Cezary_Pechcin_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        System.out.println("Podaj trzecią liczbę");
        int c = scanner.nextInt();
        if (a >= b && a >=c) {
            System.out.println("Największa liczba to " + a);
        } else if (b >= a && b >=c) {
            System.out.println("Największa liczba to " + b);
        } else {
            System.out.println("Największa liczba to " + c);
        }
    }
}

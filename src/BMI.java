import java.util.Scanner;

public class BMI {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        // BMI waga/wzrost*2 (kg/m*2) * 100
        System.out.println("Podaj swoją wagę");
        double weight = scanner.nextDouble();
        System.out.println("Podaj swój wzrost");
        double height = scanner.nextDouble();
        double bmi = weight/(height*height);
        System.out.println("Twoje BMI to: " + bmi);
    }
}

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class FirstApp {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String name = scanner.next();
        System.out.println("Ile masz lat?");
        int age = scanner.nextInt();
        System.out.println("Cześć " + name + " masz " + age + " lat");

        if(age >= 20) {
            System.out.println("Jesteś studentem!");
        } else if(age >= 6) {
            System.out.println("Jesteś uczniem!");
        } else {
            System.out.println("Jesteś gówniakiem!!!");
        }

        System.out.println("Podaj hasło");
        String password = scanner.next();
        if(password.equals("juh")) {
            System.out.println("Cześć " + name);
        } else {
            System.out.println("Odmowa dostępu, policja proszę przyjechać na facebooka!");
        }
    }
}

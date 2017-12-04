package was2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cezary_Pechcin_2 {
    public static void main(String[] args) {

        File input = new File("C:\\Users\\Cezary\\Desktop\\PD2\\PD2\\napisy.txt");
        int counter = 0;
        try{
            boolean be = true;
            Scanner scanner = new Scanner(input);
            while(scanner.hasNext()) {
                String word1 = scanner.next();
                String word2 = scanner.next();
                int a = word1.length();
                int b = word2.length();
                String words = (word1+ "\t" +word2);
                    if (a >= 3 * b || b >= 3 * a) {
                        counter++;
                    }
                    if(be){
                        System.out.println("Pierwszy znaleziony wiersz to " + words);
                        be = false;
                    }
            }
            System.out.println("Liczba takich wierszy to " + counter);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

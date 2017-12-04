package was2;

public class Switches {
    public static void main(String[] args) {
        int miesiac = 3;
        String month = null;
        switch (miesiac){
            case 1: month="Styczen";
                break;
            case 2: month="Luty";
                break;
            case 3: month="Marzec";
                break;
            default: month="ERROR";
                break;
        }
        System.out.println(month);
    }
}

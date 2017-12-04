package was2;

public class Tabliczka {
    public static void main(String[] args) {
        int[][] tabliczka = new int[11][11];
        for(int i = 1;i<tabliczka.length;i++){
            for (int j=1;j<tabliczka[i].length;j++){
                tabliczka[i][j] = j*i;
                System.out.print(tabliczka[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

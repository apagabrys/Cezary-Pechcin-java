package was2;

public class Arrays {
    public static void main(String[] args) {

    int[][] int2D = new int[3][10];
    int b = 1;
    for(int i = 0;i<int2D.length;i++){
        for (int j=0;j<int2D[i].length;j++)
        int2D[i][j] = b;
        b++;
    }
    for(int i = 0;i<int2D[i].length;i++){
        for (int j = 0; j < int2D[i].length; j++) {
            System.out.println(int2D[i][j] + "\t");
        }
    }
    System.out.println("");

    }
}

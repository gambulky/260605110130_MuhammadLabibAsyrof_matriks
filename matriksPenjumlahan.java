public class matriksPenjumlahan {
    public static void main(String[] args) {
        int  matrixA [][] = { {2, 3}, {4, 5}, };
        int  matrixB [][] = { {6, 7}, {8, 9}, };

        for ( int i = 0; i < matrixA.length; i++){
            for (int j = 0; j < matrixB.length; j++) {
              int hasil =  matrixA[i][j] + matrixB[i][j]; 
              System.out.print(hasil + " " + "\t");
             
            }
            System.out.println();
        }
    }
}
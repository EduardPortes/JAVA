package exercicioArray.propostomatriz.application;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int num = sc.nextInt();

        for (int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if (mat[i][j] == num){
                    System.out.println();
                    System.out.println("Position" + i + "," + j + ":");
                    if (j > 0){
                        System.out.println("Left: " + mat[i][j-1]);

                    }
                    if (i>0){
                        System.out.println("Top: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1){
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1){
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }






        sc.close();
    }
}

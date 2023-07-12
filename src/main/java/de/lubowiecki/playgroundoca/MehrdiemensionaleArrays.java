package de.lubowiecki.playgroundoca;

public class MehrdiemensionaleArrays {

    public static void main(String[] args) {

        int[][] matrix1; // 2d
        int[][][] matrix2; // 3d
        //int[][] matrix2[]; // 3d

        matrix1 = new int[][]{{10, 20}, {1, 3}, {100, 500, 800}};

        for (int i = 0; i < matrix1.length ; i++) {
            for (int j = 0; j < matrix1[i].length ; j++) {
                System.out.print(matrix1[i][j] + " "); // z.B. matrix1[1][0]
            }
            System.out.println();
        }

        System.out.println();

        for (int[] inner : matrix1) {
            for (int val : inner) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        System.out.println();

        matrix1 = new int[20][20];

        matrix1[10][15] = 1;

        for (int[] row : matrix1) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

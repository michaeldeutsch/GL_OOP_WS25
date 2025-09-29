package einheit_01;

import java.util.Arrays;

public class ArrayBeispiel {

    public static void main(String[] args) {

        int[][] matrix = new int[33][33];

        matrix[0][0] = 1;

        matrix[matrix.length-1][matrix.length-1] = 4;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(matrix));

    }



}

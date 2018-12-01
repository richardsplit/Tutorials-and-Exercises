import java.util.Scanner;

public class Task4 {

    /*

     */
    public static void main (String args[]) {
        Scanner reader = new Scanner(System.in);
        String dimensions = reader.nextLine();
        int M = Integer.valueOf(dimensions.split("\\s")[0]);
        int N = Integer.valueOf(dimensions.split("\\s")[1]);
        int[][] numbers1 = new int[M][N];
        int[][] numbers2 = new int[M][N];
        for (int j = 0; j < N; j++) {
            String row = reader.nextLine();
            for (int i = 0; i < M; i++) {
                numbers1[i][j] = Integer.valueOf(row.split("\\s")[i]);
            }
        }
        for (int j = 0; j < N; j++) {
            String row = reader.nextLine();
            for (int i = 0; i < M; i++) {
                numbers2[i][j] = Integer.valueOf(row.split("\\s")[i]);
            }
        }
        int[][] numbersSum = addMatrix(numbers1,numbers2);
        if (numbersSum == null) {
            System.out.println("These matrices cannot be added.");
        }
        else {
            for (int j = 0; j < N; j++) {
                for (int i = 0; i < M; i++) {
                    System.out.print(numbersSum[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    private static int[][] addMatrix (int[][] matrix1, int[][] matrix2) {
        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length)) {
            return null;
        }
        else {
            int horizontalLength = matrix1.length;
            int verticalLength = matrix1[0].length;
            int[][] matrixSum = new int[horizontalLength][verticalLength];
            for (int i = 0; i < horizontalLength; i++) {
                for (int j = 0; j < verticalLength; j++) {
                    matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
                }

            }
            return matrixSum;
        }
    }
}
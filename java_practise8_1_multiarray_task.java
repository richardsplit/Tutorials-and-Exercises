import java.util.Scanner;

public class java_practise8_1_multiarray_task {

    //1va zadacha multidimensional arrays
/*
Description :
Да се напише програма ,
която получава числа n и m - големина на матрица,
и после m*n числа,
които са елементите на матрицата.
След това ще получите число,
което е номер на колона,
и трябва да изкарате сумата на всички елементи от тази колона.
 */
        public static void main (String []args) {
            // Scanner sc = new Scanner(System.in);
            int rows = 2; //sc.nextInt();

            // Scanner sc = new Scanner(System.in);
            int cols = 2; //sc.nextInt();

            // Scanner sc = new Scanner(System.in);
            int colNum = 2 - 1; //sc.nextInt();

            int sum = 0;

            int[][] arr = new int[rows][cols];

            for (int row = 0; row < rows-1; row++) {
                for (int col = 0; col < cols-1; col++) {

                    if (col == colNum) {
                        Scanner sc = new Scanner(System.in);
                        arr[row][col] = sc.nextInt();
                        sum += arr[row][col];
                    } else {
                        Scanner sc = new Scanner(System.in);
                        arr[row][col] = sc.nextInt();
                    }
                }
            }
            System.out.println(sum);
        }
}



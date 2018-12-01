import java.util.Scanner;
public class java_practise001_multidimensionalarrays_t1 {

    public static void main (String []args){
      //  Scanner reader=new Scanner(System.in);
        int sum=0;
        int colnum=2-1;
        int rows=0;
        int cols=0;


        int [][] array =new int [rows][cols];

        for (int row = 0; row <rows ; row++) {
            for (int col = 0; col <cols ; col++) {

                    if(col == colnum){
                        Scanner reader =new Scanner(System.in);
                        array[row][col] = reader.nextInt();
                        sum +=array[row][col];
                    }
                    else {
                        Scanner reader =new Scanner(System.in);
                        array [row][col] = reader.nextInt();
                        }

            }

        }
        System.out.println(sum);

    }
}

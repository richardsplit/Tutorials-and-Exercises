import java.util.Scanner;
public class java_practise8_3_multiarray_task {

    public static void main(String []args){
        Scanner read=new Scanner(System.in);

        int rows=read.nextInt();
        int cols=read.nextInt();


        int [][]arr =new int [rows][cols];

        int maxrowvalue=0;
        int maxcolvalue=0;

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                arr[i][j]=read.nextInt();
            }
        }

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {

                if(maxrowvalue<arr[i][j]){
                    maxrowvalue=arr[i][j];
                }
            }
            System.out.println(maxrowvalue);
        }

        for (int i = 0; i <cols ; i++) {
            for (int j = 0; j <rows ; j++) {

                if (maxcolvalue<arr[j][i]) {
                    maxcolvalue=arr[j][i];
                }
            }
            System.out.println(maxcolvalue);
        }


    }
}

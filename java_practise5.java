import java.util.Scanner;
public class java_practise5 {

    public static void main(String []args){


        Scanner rich2=new Scanner(System.in);
        int n=rich2.nextInt();
        int []array =new int[n];

        for (int i = 0; i <n ; i++) {
        array[i]=rich2.nextInt();
        }

        for (int i = 0; i <array.length/2 ; i++) {
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }

        for (int i = 0; i <n ; i++) {
        }
        System.out.println(array + "");
        task2(array);
    }





    public static void task2(int arr[]){
        Scanner rich=new Scanner (System.in);
        int n=rich.nextInt();


        for (int i = 0; i <n ; i++) {
            int a = rich.nextInt();

            if (a % 2 == 0) {
                arr[i] = 0;
            } else {
                arr[i] = a;

            }
        }

            for (int i = 0; i <n ; i++) {
                System.out.println(arr[i] + " ");
            }
        }

    }


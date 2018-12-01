import java.util.Scanner;
public class java_practise7 {

    public static void calc(int array[]) {
        Scanner rich = new Scanner(System.in);

        int n = rich.nextInt();
        array = new int[n];
        int sum = 0;
        int sum1 = 0;


        for (int i = 0; i < n; i++) {
            array[i] = rich.nextInt();
            sum += array[i];
        }

        sum1 = sum / n;
        System.out.println("The average is" + sum1);
    }

    public static void main(String[] args) {
            int []array= {1,2,3,4};
                    calc(array);

    }
}



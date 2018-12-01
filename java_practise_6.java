import java.util.Scanner;
public class java_practise_6 {

    public static void main(String[] args) {
        Scanner rich = new Scanner(System.in);
        int n = rich.nextInt();
        int sum = 0;

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = rich.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        System.out.println(sum);

    }
}



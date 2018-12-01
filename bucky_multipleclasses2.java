import java.util.Scanner;

public class bucky_multipleclasses2
{

    public static void main (String []args)
    {
        Scanner input =new Scanner(System.in);
        bucky_multipleclasses bucky_multipleclassesObject = new bucky_multipleclasses();


       System.out.println("Enter your name:");
       String name = input.nextLine();
        bucky_multipleclassesObject.simpleMessage(name);

    }
}

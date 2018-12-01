import java.util.Scanner;
public class java_practise_2 {

    public static void main (String []args) {

     Scanner rich=new Scanner(System.in);
     java_practise_1 java_practise_1Object=new java_practise_1();

     System.out.print("Enter your name: ");
     String name=rich.nextLine();

     System.out.print("Enter your age: ");
     String age=rich.nextLine();

     java_practise_1Object.simpleMessage(name,age);
    }
}

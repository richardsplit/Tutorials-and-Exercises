import java.util.Scanner;


//Telerik Kitty

/*
Description
https://judge.telerikacademy.com/problem/30kitty
 */
public class java_practise10 {



    public static void main(String[] args) {
        boolean isDeadlock=false; //za break na cikala
        int currentPosition =0;

        int totalsouls=0;
        int totalfood =0;
        int totaldeadlocks=0;
        int totaljumps=0;

        Scanner in=new Scanner(System.in);
        String input=in.nextLine();
        String jumps=in.nextLine();

    String  arr[]= jumps.split( " ");

       int characterLenght = input.length();

        for (int index = 0; index <arr.length && !isDeadlock ; index++) {
            int nextPossition=currentPosition  ;
            if(currentPosition+Integer.valueOf(arr[index])<arr.length){
            }
            else {

            }
                    }

        }


    }


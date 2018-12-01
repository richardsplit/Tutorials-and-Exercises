import java.util.Scanner;
public class bucky_multidimensionalarray_1 {

    //table for multidimensional arrays

    public static void main(String[]args){

        int rich[][] = {{1,2,3,4},{1,2,3,4}};
        int rich2 [][] ={{1,2,3,4},{2},{3,5,6}};
        System.out.println("This is the first array");
       display(rich);

       System.out.println("This is the second array");
       display(rich2);
    }

    public static void display (int x [] []){
        for (int row=0;row<x.length;row++){
            for (int column=0;column<x[row].length;column++){
                System.out.print(x[row][column]+"\t");
            }
        System.out.println();
        }
    }
}

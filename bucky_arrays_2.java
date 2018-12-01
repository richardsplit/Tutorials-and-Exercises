public class bucky_arrays_2 {

    //Sum of all element in the array

    public static void main(String []args){

        int rich[]={3,5,8,4,2};
        int sum=0;

        for (int i = 0; i <rich.length ; i++) {
            sum+=rich[i];
//"+=" Dobavq indexite ot masiva kum stoinosta na sum,toest v sum imame 0 dobavq 3 posle dobavq 5 i t.n
        }

        System.out.print("The sum of the array rich is: " +sum);
    }

}

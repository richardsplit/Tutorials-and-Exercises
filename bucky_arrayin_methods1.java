public class bucky_arrayin_methods1 {
 //   Java Programming Tutorial - 32 - Arrays in Methods
    public static void main(String []args){
        int rich [] ={3,2,1,5};

        change(rich);

        for(int y:rich)
            System.out.println(y);
    }

    public static void change(int x[]){
        for (int counter = 0; counter <x.length ; counter++) {
            x[counter]+=5;
        }
    }

}

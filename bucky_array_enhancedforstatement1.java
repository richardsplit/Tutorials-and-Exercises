public class bucky_array_enhancedforstatement1 {

    public static void main(String []args){
        int rich[]={1,2,3,4,5};
        int total=0;

        for(int x: rich){
//'int x :rich- promenlivata 'int x' vzima stoinostite v masiva "rich" '
            /*
            example also
            Let's say you have an array named  string shoppingList[] = {eggs, milk, bread, tuna};
Now when it comes to the loop, here's what you can do:

            for (string item: shoppingList) {
       System.out.println(item);
}

The output will be strings like this:
eggs
milk
bread
tuna
             */
            total+=x;
        }

        System.out.println(total);
    }
}

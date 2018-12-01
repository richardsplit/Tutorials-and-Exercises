import java.util.Scanner;
public class java_practise_3 {

    ////Task practise related to "java_practise_4"
    public void Task(){


    Scanner rich=new Scanner(System.in);
    System.out.print("Vuvedete n:");
    int  n=rich.nextInt();
    System.out.print("Vuvedete l:");
     int l=rich.nextInt();

    for (int i1=1;i1<=n;i1++) {
        //first number of the password

        for (int i2=1;i2<=n;i2++){
            //second number of the password
                for(char c1='a';c1<='a' +1;c1++){
                    //first character

                    for(char c2='b';c2<='b' +1;c2++){

                        for(int i3 = Math.max(i1,i2)+1 ; i3<=n ;i3++)
                        System.out.println(String.format("%d%d%c%c%d",i1,i2,c1,c2,i3));
                    }
                }

            }
        }
    }
}

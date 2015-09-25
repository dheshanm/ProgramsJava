//Using Method()

import java.util.Scanner;

/**
 * Created by dheshan on 9/25/2015.
 */
public class CheckPrime {
    public static int Prime(int number){
        int i=0,z=0;
        for(int n=2;n<number;n++){
            if(number%n==0){
                //System.out.println("The number is not a Prime Number");
                i=1;
                z=0;
                break;
            }
        }
        if(i==0){
            //System.out.println("The number is a Prime Number");
            z=1;
        }
        return (z);
    }

        public static void main(String Args[]){
            Scanner in=new Scanner(System.in);
            int num;
            System.out.print("Enter a number     :");
            num=in.nextInt();
            if(Prime(num)==1){
                System.out.println("The number is a Prime Number");
            }
            if(Prime(num)==0){
                System.out.println("The number is not a Prime Number");
            }

        }


}

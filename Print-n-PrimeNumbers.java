package starting.java.tutorials;

import java.util.Scanner;

/**
 * Created by dheshan on 9/25/2015.
 */
public class Print-n-PrimeNumbers {
    public static int Prime(int number) {
        int i = 0, z = 0;
        for (int n = 2; n < number; n++) {
            if (number % n == 0) {
                //System.out.println("The number is not a Prime Number");
                i = 1;
                z = 0;
                break;
            }
        }
        if (i == 0) {
            //System.out.println("The number is a Prime Number");
            z = 1;
        }
        return (z);
    }

    public static void main(String Args[]) {
        Scanner in = new Scanner(System.in);
        int num, z = 1, i, d = 2;
        System.out.print("Enter the number of Prime Numbers Required     :");
        num = in.nextInt();
        System.out.println("The Required, "+num+" Prime Numbers are    :");
        for(i=2;i<=20000;i++){
        if(z<=num) {
            if (Prime(i) == 1) {
                System.out.print(i+"    ");
                z = z + 1;
            }
            if (Prime(i) == 0) {
                //System.out.println("The number " + i + " is not a Prime Number");
            }
        }
        }


    }
}

package tutorials.Next;

import java.util.Scanner;

/**
 * Created by Dheshan M (@D-codex) on 11/20/2015.
 */
public class PrimeOmega {
    public static long Prime(long number) {
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
        int num, z = 1;
        long i,d=2;
        System.out.print("Enter the number of Prime Numbers Required     :");
        num = in.nextInt();
        System.out.print("Enter the Starting value   :");
        d = in.nextLong();
        System.out.println("The Required, " + num + " Prime Numbers are    :");
        for (i = d; i <= 2000000000; i++) {
            if (z <= num) {
                if (Prime(i) == 1) {
                    System.out.print(i + "    ");
                    if(z%5==0)
                        System.out.println();
                    z = z + 1;
                }
            }
        }


    }
}

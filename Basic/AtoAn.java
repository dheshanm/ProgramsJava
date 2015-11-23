import java.util.Scanner;

/**
 * Created by Dheshan on 9/9/2015.
 * Convert 'a' to 'an' in a String if the word starts with  an vowel
 */
public class AtoAn {
    public static void main(String Args[]) {
        int i, j, l;
        String S, S1 = "";
        char ch1 = ' ', ch2 = ' ', ch3 = ' ';
        Scanner in = new Scanner(System.in);
        System.out.print("Input the String   :");
        S = in.nextLine();
        S = " " + S + " ";
        l = S.length();
        for (i = 0; i < l - 2; i++) {
            ch1 = S.charAt(i);
            ch2 = S.charAt(i + 1);
            ch3 = S.charAt(i + 2);
            if ((ch1 == ' ') && (ch2 == 'a') && (ch3 == ' ')) {
                S1 = S1 + " an ";
                i=i+2;
            }
            else{
                S1=S1+ch1;
            }
        }
        System.out.println("The new Statement is ");
        System.out.println(S1+S.charAt(l-2));
    }
}

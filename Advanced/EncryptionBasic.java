package tutorials.Next;
import java.io.*;
import java.util.*;

/**
 * Created by Dheshan M (@D-codex) on 10/14/2015.
 */
public class EncryptionBasic {
    public static char Encryptor(char c) {
        long value = (long) c;
        long ChangeValueTo = value -25;
        char NewChar = (char) ChangeValueTo;
        return (NewChar);
    }

    public static char Dencryptor(char c) {
        long value = (long) c;
        long ChangeValueTo = value +25;
        char NewChar = (char) ChangeValueTo;
        return (NewChar);
    }

    public static void main(String Args[])throws IOException {
        Scanner in = new Scanner(System.in);
        String Input, OutputD = "";
        String EOutput = "";
        char c1, c2;
        int l, i,c;
        System.out.println("Enter the Function to perform :\n[1]Encrypt     [2]Decrypt");
        c=in.nextInt();
        int choice = c;
        FileWriter fr=new FileWriter("EncryptionDatabase.txt",true);
        BufferedWriter br=new BufferedWriter(fr);
        PrintWriter pw=new PrintWriter(br);
        switch (choice) {
            case 1:
                Scanner s1=new Scanner(System.in);
                System.out.println("Enter your String to be Encrypted    :");
                Input = s1.nextLine();
                l = Input.length();
                for (i = 0; i <= l - 1; i++) {
                    c1 = Input.charAt(i);
                    c2 = Encryptor(c1);
                    EOutput = EOutput + c2;
                }
                System.out.println("Encrypted Code   :" + EOutput);
                pw.println(Input);
                pw.println(EOutput);
                break;

            case 2:
                Scanner s2=new Scanner(System.in);
                System.out.println("Enter your String to be Decrypted    :");
                Input = s2.nextLine();
                l = Input.length();
                for (i = 0; i <= l - 1; i++) {
                    c1 = Input.charAt(i);
                    c2 = Dencryptor(c1);
                    OutputD = OutputD + c2;
                }
                System.out.println("Decrypted Code   :" + OutputD);
                pw.println(OutputD);
                pw.println(Input);
                break;
        }
        pw.close();
        br.close();
        fr.close();

    }
}
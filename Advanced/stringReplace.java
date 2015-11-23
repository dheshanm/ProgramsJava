package tutorials.Next;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Dheshan M (@D-codex) on 11/20/2015.
 */
public class stringReplace {
    public static void main(String Args[])throws IOException{
        int c,chk;
        String w1,w2;
        String inp,out="";
        String a,x,y;
        while(true) {
            System.out.println("Enter 1 to append changes to  Database\nEnter 2 to replace words Rightaway !!!!!\nEnter 3 to convert Full sentences to Shortform !!!!!");
            System.out.println("Enter 0 to Terminate Program");
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your Choice     :");
            c = in.nextInt();
            if(c==0)
                break;
            switch (c) {
                case 1:
                    FileWriter fw = new FileWriter("ShortcutDatabase.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);
                    FileWriter fr = new FileWriter("ReverseShortcutDatabase.txt", true);
                    BufferedWriter br = new BufferedWriter(fr);
                    PrintWriter pr = new PrintWriter(br);
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter the word to be Replaced    :");
                    w1 = sc.nextLine();
                    System.out.print("Enter the word that will be used instead  :");
                    w2 = sc.nextLine();
                    pw.print(w1 + "   ");
                    pw.print(w2 + "\n");
                    pr.print(w2 + "   ");
                    pr.print(w1 + "\n");
                    pw.close();
                    bw.close();
                    fw.close();
                    pr.close();
                    br.close();
                    fr.close();
                    sc.close();
                    break;

                case 2:
                    Scanner s = new Scanner(System.in);
                    System.out.print("Enter the Sentence you want changed   :");
                    inp = s.nextLine();
                    StringTokenizer st = new StringTokenizer(inp);
                    while (st.hasMoreTokens()) {
                        Scanner fs = new Scanner(new File("ShortcutDatabase.txt"));
                        a = st.nextToken();
                        chk = 0;
                        while (fs.hasNext()) {
                            x = fs.next();
                            y = fs.next();
                            if (a.equals(x)) {
                                out = out + " " + y;
                                chk = 1;
                            }
                        }
                        if (chk == 0) {
                            out = out + " " + a;
                        }
                    }
                    char c1=out.charAt(1);
                    c1=(Character.toUpperCase(c1));
                    out=c1+out.substring(2);
                    System.out.println("Converted Statement   :-        "+out);
                    break;

                case 3:
                    Scanner s0 = new Scanner(System.in);
                    System.out.print("Enter the Sentence you want changed   :");
                    inp = s0.nextLine();
                    StringTokenizer st0 = new StringTokenizer(inp);
                    while (st0.hasMoreTokens()) {
                        Scanner fs0 = new Scanner(new File("ReverseShortcutDatabase.txt"));
                        a = st0.nextToken();
                        chk = 0;
                        while (fs0.hasNext()) {
                            x = fs0.next();
                            y = fs0.next();
                            if (a.equalsIgnoreCase(x)) {
                                out = out + " " + y;
                                chk = 1;
                            }
                        }
                        if (chk == 0) {
                            out = out + " " + a;
                        }

                    }
                    System.out.println(out);
                    break;
            }
            Scanner test = new Scanner(System.in);
            System.out.print("Enter 0 to Continue program     :");
            int checker=test.nextInt();
            if(checker!=0)
                break;
        }
        System.out.println("\n________________END__OF__PROGRAM________________");
    }
}

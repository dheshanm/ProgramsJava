package tutorials.Next;
import java.io.*;
import java.util.*;

/**
 * Created by Dheshan M (@D-codex) on 10/10/2015.
 */
public class MarksStorage {
    public static void main(String Args[])throws IOException{
        String phy,chem,math,eng,cs,Exam,totals;
        int c,i,j,m,n;
        int ph,ch,ma,en,co,total,totalp = 0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 0 to Input marks to Database ;");
        System.out.println("Enter 1 to view Records");
        c=in.nextInt();
        switch(c){
            case 0:
                FileWriter fr=new FileWriter("MarksDatabase.txt",true);
                BufferedWriter br=new BufferedWriter(fr);
                PrintWriter pw=new PrintWriter(br);
                System.out.print("Enter your Examination name           :");
                Exam=in.next();
                System.out.print("Enter Your Physics Mark               :");
                phy=in.next();
                ph=Integer.parseInt(phy);
                System.out.print("Enter your Chemistry Mark             :");
                chem=in.next();
                ch=Integer.parseInt(chem);
                System.out.print("Enter your Mathematics Mark           :");
                math=in.next();
                ma=Integer.parseInt(math);
                System.out.print("Enter your English Mark               :");
                eng=in.next();
                en=Integer.parseInt(eng);
                System.out.print("Enter your Computer Science Mark      :");
                cs=in.next();
                co=Integer.parseInt(cs);
                total=ph+ch+ma+en+co;
                totalp=(total*100)/500;
                System.out.println("You have obtained "+totalp+"%");
                pw.print(Exam+" ");
                pw.print(phy+" ");
                pw.print(chem+" ");
                pw.print(math+" ");
                pw.print(eng+" ");
                pw.print(cs+" ");
                pw.print(total+" ");
                pw.println(totalp+" ");
                pw.close();
                br.close();
                fr.close();


            case 1:
                Scanner s=new Scanner(new File("MarksDatabase.txt"));
                System.out.println("\n\nAccessing Marks Database... Please wait while processing records.... ");
                System.out.println("Connection Established Successfully !! Printing Results..... \n\n\n");
                System.out.println("Examination Name      Physics    Chemistry   Mathematics   English   Comp.   Total");
                while(s.hasNext()){
                    Exam=s.next();
                    phy=s.next();
                    chem=s.next();
                    math=s.next();
                    eng=s.next();
                    cs=s.next();
                    totals=s.next();
                    String totalpr=s.next();
                    System.out.println(Exam+"            "+phy+"         "+chem+"          "+math+"            "+eng+"        "+cs+"      "+totalpr);
                }
                System.out.println("\n\n"+"_______________END______OF_____RESULT________________");
                s.close();
        }
    }

}
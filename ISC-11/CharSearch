import java.io.*;
import java.util.Scanner;

/**
 * Created by Dheshan M (@D-codex) on 2/16/2016.
 */
public class CharSearch {
    public static void main(String args[])throws IOException{
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a Statement to be checked  :");
        String s,pos=" ";
        s=in.nextLine();
        int l,i,c=0;
        l=s.length();
        System.out.print("Enter the Letter to be searched   :");
        char ch;
        ch=in.next().charAt(0);
        for(i=0;i<l;i++){
            if(s.charAt(i)== ch){
                pos=pos+",";
                c=c+1;
                pos=pos+i;
            }
        }
        if(c==0)
            System.out.println("There are no matches in the given Statement")    ;
        else
        System.out.println("No.of Hits  = "+c);
        System.out.println("The Letter '"+ch+"' is present at "+pos.substring(2));
    }
}

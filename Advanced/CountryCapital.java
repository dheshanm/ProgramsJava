package tutorials.Next;
import java.io.*;
import java.util.*;

/**
 * Created by Dheshan M (@D-codex) on 10/12/2015(Nov 22).
 */
public class CountryCapital {
    public static void AppendData()throws IOException{
        Scanner inth=new Scanner(System.in);
        FileWriter fw = new FileWriter("CountryDatabase.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        String Country,Capital;
        System.out.print("Enter the Country's Name    :");
        Country=inth.nextLine();
        System.out.print("Enter the Country's Capital :");
        Capital=inth.nextLine();
        char ch=Character.toUpperCase(Country.charAt(0));
        Country=ch+Country.substring(1);
        Country=Country.replace(' ','-');
        char ch1=Character.toUpperCase(Capital.charAt(0));
        Capital=ch1+Capital.substring(1);
        Capital=Capital.replace(' ','-');
        pw.print(Country + "   ");
        pw.print(Capital + "\n");
        pw.close();
        bw.close();
        fw.close();
    }
    public static void main(String Args[])throws IOException{
        String country,countryc;
        String countryName,Capital;
        Scanner in=new Scanner(System.in);
        int chk=0;
        System.out.print("Enter Country Name     :");
        countryc=in.nextLine();
        char ch=Character.toUpperCase(countryc.charAt(0));
        countryc=ch+countryc.substring(1);
        country=countryc.replace(' ','-');
        System.out.println("Accessing Capitals Database......   Establishing Connection.....");
        System.out.println("Connection Established...... Accessing Records.......\n");
        System.out.println("_____________________________________________________________________");
        countryc=countryc.replace('-',' ');

        Scanner s=new Scanner(new File("CountryDatabase.txt"));
        while(s.hasNext()){
            countryName=s.next();
            Capital=s.next();
            if(countryName.equalsIgnoreCase(country)){
                System.out.println("\nCountry Name Entered    :"+countryName);
                Capital=Capital.replace('-',' ');
                System.out.println("Capital    :"+Capital);
                chk=1;
            }
        }
        s.close();
        if(chk==0) {
            System.out.println("\nCountry Name Entered    :"+countryc);
            System.out.println("Country NOT_FOUND");
            System.out.println("Would you like to Add the missing Country Press [0] to Add????");
            String str=in.nextLine();
            char check=str.charAt(0);
            if(Character.isDigit(check))
            if (Integer.valueOf(str)==0) {
                AppendData();
            }

        }
        System.out.println("\n________________END__OF__PROGRAM________________");
    }
}

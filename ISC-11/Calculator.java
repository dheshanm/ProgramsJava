package TEST;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Dheshan M (@D-codex) on 01/16/2016.
 */
public class Calculator {
    public static String removePoint(String in){
        int l=in.length();
        char ch,ch1;
        for(int i=l-1;i>0;i--){
            ch=in.charAt(i);
            ch1=in.charAt(i-1);
            if((ch=='0')&&(ch1=='.')){
                in=in.substring(0,i-1);
                break;
            }
        }
        return(in);
    }
    public static void CalculatorScientific(){
        Scanner inp=new Scanner(System.in);
        System.out.println(
                "What function do you need ?\n" +
                        "cos \t" + "sin \t" + "tan \n" + "1 \t\t" + "2 \t\t" + "3 \n" +
                        "log \t" + "Sqrt \t" + "Power \n" + "4 \t\t" + "5 \t\t" + "6 \n" +
                        "Type 7 to find Exponent");
        int n3=inp.nextInt();
        int a,b;
        double out=0;
        String output;
        switch(n3)
        {
            case 1:
            {
                System.out.print("Enter the Number to find Cosine   :");
                a=inp.nextInt();
                double q=Math.cos(a);
                out=q;
                break;
            }
            case 2:
            {
                System.out.print("Enter the Number to find Sine :");
                a=inp.nextInt();
                double q=Math.sin(a);
                out=q;
                break;
            }
            case 3:
            {
                System.out.print("Enter the Number to find Tangent  :");
                a=inp.nextInt();
                double q=Math.tan(a);
                out=q;
                break;
            }
            case 4:
            {
                System.out.print("Enter the Number to find Logarithm  :");
                a=inp.nextInt();
                double q=Math.log(a);
                out=q;
                break;
            }
            case 5:
            {
                System.out.print("Enter the Number to find SquareRoot  :");
                a=inp.nextInt();
                double q=Math.sqrt(a);
                out=q;
                break;
            }

            case 6:
            {
                System.out.println("Enter the Numbers base to the Power of any number   :");
                System.out.print("Enter the Base    :");
                b=inp.nextInt();
                System.out.print("Enter the Power   :");
                a=inp.nextInt();
                double q=Math.pow(b,a);
                out=q;
                break;
            }

            case 7:
            {
                System.out.println("Enter the Number to find Exponent");

                a=inp.nextInt();
                double q=Math.exp(a);
                out=q;
                break;
            }
        }
        output = removePoint(String.valueOf(out));
        System.out.println("RESULT   :" + output);
    }
    
    public static double CalculatorMain (String input){
        String buffer;
        double numbuffer;
        int u=0,l;
        char buf;
        input=input.trim();
        l=input.length();
        input=input+" ";
        l=input.length();
        double num[]=new double[25];
        char func[]=new char[25];
        for(int i=0;i<l;i++){
            char chk=input.charAt(i);
            if(!Character.isDigit(chk)){
                 if(chk!='.') {
                    if(chk!=' ') {
                        buffer = input.substring(0, i);
                        numbuffer = Double.parseDouble(buffer);
                        num[u] = numbuffer;
                        buf = input.charAt(i);
                        func[u] = buf;
                        input = input.substring(i + 1);
                        u = u + 1;
                        l = input.length();
                        i = 0;
                    }
                }
            }
        }
        if (Character.isDigit(input.charAt(0))) {
            input = input.trim();
            numbuffer = Double.parseDouble(input);
            num[u] = numbuffer;
        }
        else{
            input = input.trim();
            input=input.substring(1);
            numbuffer = Double.parseDouble(input);
            num[u] = numbuffer;
        }
        for(int i=0;i<=u;i++){
            switch(func[i]){
                case '+':
                    num[i+1]=num[i]+num[i+1];
                    break;

                case '*':
                    num[i+1]=num[i]*num[i+1];
                    break;

                case '/':
                    num[i+1]=num[i]/num[i+1];
                    break;

                case '-':
                    num[i+1]=num[i]-num[i+1];
                    break;
            }
        }
        double ans=num[u];
        return(ans);
    }
    public static void main(String Args[])throws IOException {
        String input,output;
        Scanner in=new Scanner(System.in);
        double out;
        System.out.print("Enter you Mathematical Statement \n" +
                "[Don't Forget to type the proper Mathematical Symbols]\n" +
                "Iy you want Scientific Functions Type 'scientific' .....\n" +
                "Enter the Equation   :");
        input=in.nextLine();
        if(input.equalsIgnoreCase("scientific")){
            CalculatorScientific();
        }
        else {
            out = CalculatorMain(input);
            output = removePoint(String.valueOf(out));
            System.out.println("RESULT   :" + output);
        }
    }

}

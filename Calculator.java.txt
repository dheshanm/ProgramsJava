import java.util.Scanner;

public class Calculator {

public static void main(String Args[]){
    Scanner in=new Scanner(System.in);
    double n1,n2,n3;
    System.out.println("Choose the Function to Perform");
    String exec;
    exec=in.next();
    switch(exec)
    {
        case ("*"):
            System.out.println("Enter the Numbers to Multiply");
            n1=in.nextDouble();
            n2=in.nextDouble();
            n3=n1*n2;
            System.out.println("The Result is  "+n3);
            break;
        case "/":
            System.out.println("Enter the Numbers to Divide");
            n1=in.nextDouble();
            n2=in.nextDouble();
            n3=n1/n2;
            System.out.println("The Result is  "+n3);
            break;
        case "+":
            System.out.println("Enter the Numbers to Add");
            n1=in.nextDouble();
            n2=in.nextDouble();
            n3=n1+n2;
            System.out.println("The Result is  " +n3);
            break;
        case "-":
            System.out.println("Enter the Numbers to Subtract");
            n1=in.nextDouble();
            n2=in.nextDouble();
            n3=n1-n2;
            System.out.println("The Result is  "+n3);
            break;
        default:
            System.out.println("You Chose the wrong option");

    }

    }
}


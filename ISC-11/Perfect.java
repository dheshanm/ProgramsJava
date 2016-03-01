import java.io.*;

/**
 * Created by Dheshan M (@D-codex) on 2/29/2016.
 */
public class Perfect{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter an integer : ");
        int number = Integer.parseInt(reader.readLine());
        int sqrt = (int) Math.sqrt(number);
        if(sqrt*sqrt == number)
            System.out.println(number+" is a perfect square number!");
        else
            System.out.println(number+" is NOT a perfect square number!");
    }
}

package tutorials.Next;
import java.util.Scanner;

/**
 * Created by Dheshan M (@D-codex) on 10/26/2015.
 */
public class AscendingOrder {
    public static void main(String Args[]) {
        int i,j;
        int temp;
        int name[]=new int[10];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Names to be Sorted   :");
        for(i=0;i<10;i++){
            name[i]=in.nextInt();
        }
        System.out.println("___________________________________________________\nSorted List\n");
        for(i=0;i<9;i++){
            for(j=(i+1);j<10;j++){
                if(name[i]>name[j]){
                    temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                }
            }
        }
        for(i=0;i<10;i++){
            System.out.println(name[i]);
        }
    }
}
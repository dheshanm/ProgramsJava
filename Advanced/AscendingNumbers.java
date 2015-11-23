package tutorials.Next;

import java.util.Scanner;

/**
 * Created by Dheshan M (@D-codex) on 10/26/2015.
 */
public class AscendingNumbers {
    public static void main(String Args[]) {
        int i,j;
        int temp;
        int name[]=new int[10001];
        String buffer;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Numbers to be Sorted   :");
        i=0;
        do {
            buffer = in.next();
            name[i] = Integer.valueOf(buffer);
            i++;
        } while (name[i-1] != 0);

        System.out.print("___________________________________________________\nSorted List\n");
        for(i=0;i<10000;i++){
            for(j=(i+1);j<10001;j++){
                if(name[i]>name[j]){
                    temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                }
            }
        }
        for(i=0;i<10000;i++){
            if(name[i]!=0)
            System.out.println(name[i]);
        }
    }
}
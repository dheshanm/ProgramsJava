import java.util.Scanner;

/**
 * Created by Dheshan on 9/8/2015.
 * Calculate the price for posting a courier if the courier company demands Rs.50 for posting Rs.1 for every gram above
 *  200g and Rs.2 for anything above 500g.
 **/
public class CourierPrice {
    public static void main(String Args[]){
        int w,i,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Input the weight of the Package  :");
        w=in.nextInt();
        c=50;
        ;
        if(w>200){
        for(i=200;i<w;i++){
            c=c+1;
            }
        }
        if(w>500) {
            for (i = 500; i < w; i++) {
                c = c + 1;
            }
        }
        System.out.println("The total cost for the package is   :"+c);
    }
}

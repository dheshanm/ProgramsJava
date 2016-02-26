import java.util.*;
/**
 * Created by Dheshan M (@D-codex) on 2/26/2016.
 */
public class Quiz {
    public static int qn=1,score=0;
    public static String Qbank(){
        int c=qn;
        String o="Insufficient Questions....";
        switch(c){
            case 1:
                o="Which Vitamin is required for in clotting of blood?\n1 :Vitamin A\n2: Vitamin B\n3: Vitamin E\n4: Vitamin K\n";
                break;
            case 2:
                o="Alphabet is a parent company of ....\n1: Yahoo\n2: Google\n3: Microsoft\n4: Cisco\n";
                break;
            case 3:
                o="Famous noodles brand \"Maggi\" is owned by...\n1: Nestle\n2: Pepsico\n3: Parle Foods\n4: ITC\n";
                break;
            case 4:
                o="A satellite in vacuum...\n1: Is kept in orbit by remote control\n2: Is kept in orbit by retro-rocket\n3: Derives energy from gravitational field\n" +
                        "4: Does not require any energy for orbiting\n ";
                break;
            case 5:
                o="The nuclear force is...\n1: Short range Force\n2: Long range Force\n";
                break;
            case 6:
                o="According to kinetic theory gases, at the temperature absolute zero, the gas molecules\n1: Start movement\n2: Become massless\n3: Stops Movement\n" +
                        "4: Start emitting light\n";
                break;
            case 7:
                o="Rule of law prevails in ......\n1: Dictatorship\n2: Democracy\n";
                break;
            case 8:
                o="Rubber is a product of .....\n1: Fibre\n2: Latex\n3: Resin\n4: Gum\n";
                break;
            case 9:
                o="Chenghez Khan was a ....\n1: Turk\n2: Mongol\n3: Persian\n4: Afgan\n";
                break;
            case 10:
                o="Among the given nutrients, milk is a poor source of ...\n1: Calcium\n2: Protein\n3: Carbohydrates\n4: Vitamin C\n";
                break;
        }
        return(o);
    }
    public static void scoreincrementer(){
        System.out.println("Correct !!");
        score=score+10;
        System.out.println("___________________________________________________________________");
    }
    public static void Checker(int ans){
        int c=qn;
        qn=qn+1;
        switch(c){
            case 1:
                if(ans==4)
                    scoreincrementer();
                else System.out.println("Wrong Answer...\n___________________________________________________________________");
                break;
            case 2:
                if(ans==2)
                    scoreincrementer();
                else System.out.println("Wrong Answer...\n___________________________________________________________________");
                break;
            case 3:
                if(ans==1)
                    scoreincrementer();
                else System.out.println("Wrong Answer...\n___________________________________________________________________");
                break;
            case 4:
                if(ans==4)
                    scoreincrementer();
                else System.out.println("Wrong Answer...\n___________________________________________________________________");
                break;
            case 5:
                if(ans==1)
                    scoreincrementer();
                else System.out.println("Wrong Answer...\n___________________________________________________________________");
                break;
            case 6:
                if(ans==3)
                    scoreincrementer();
                else System.out.println("Wrong Answer...\n___________________________________________________________________");
                break;
            case 7:
                if(ans==2)
                    scoreincrementer();
                else System.out.println("Wrong Answer...\n___________________________________________________________________");
                break;
            case 8:
                if(ans==2)
                    scoreincrementer();
                else System.out.println("Wrong Answer...\n___________________________________________________________________");
                break;
            case 9:
                if(ans==2)
                    scoreincrementer();
                else System.out.println("Wrong Answer...\n___________________________________________________________________");
                break;
            case 10:
                if(ans==4)
                    scoreincrementer();
                else System.out.println("Wrong Answer...\n___________________________________________________________________");
                break;
            default:
                System.out.println("Wrong Answer.. :(");
        }
    }
    public static void number(){
        System.out.println("Question #"+qn);
    }
    public static void print(String input){
        System.out.print(input);
    }
    public static void main(String Args[]){
        int i=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Good Day!!\nYou are about to be Examined...\nBe Prepared.\n");
        System.out.print("Enter 'YES' to prove you are a human and to proceed to the Quiz  :");
        String intro=in.nextLine();
        if(intro.equalsIgnoreCase("yes"))
            i=1;
        switch(i){
            case 1:
                while(qn<=10) {
                    number();
                    print(Qbank());
                    print("Answer   :");
                    Checker(in.nextInt());
                }
                System.out.println("You Scored    :"+score);
                break;
            default:
                System.out.print("You FAILED the human Test...");
        }
    }
}

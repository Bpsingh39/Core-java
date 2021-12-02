package assignments;

import java.util.Optional;
import java.util.Scanner;

public class Calciwithchoice {

    int add(int a,int b){
           System.out.println("You enter the value for ADDITION");
        int result=a+b;
        return  result;

    }
    int sub(int a,int b){
        int result=a-b;
        return result;
    }
    int mul(int a,int b){
        int result=a*b;
        return result;
    }
    float divide(float a,int b){
        float reult=a/b;
        return reult;
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the choice: press 1 for addition, press 2 for substraction, press 3 for multiplication, press 4 for divide");
        int choice=scan.nextInt();
        System.out.println("Enter the value of a :->");

        int a=scan.nextInt();
        System.out.println("Enter the value of b :->");

        int b=scan.nextInt();


        Calciwithchoice object=new Calciwithchoice();

        if (choice==1){
            int output=object.add(a,b);
            System.out.println(output);
        }
        else if(choice==2){
            System.out.println("You enter the value for subtraction ");
            int output=object.sub(a,b);
            System.out.println(output);
        }
        else if(choice==3){
            System.out.println("You enter the value for multiplication");
            int output=object.mul(a,b);
            System.out.println(output);
        }
        else if(choice==4){
            System.out.println("You enter the value for divide");
            float output=object.divide(a,b);
            System.out.println(output);
        }
        else {
            System.out.println("You enter invalid key");
        }

    }
}

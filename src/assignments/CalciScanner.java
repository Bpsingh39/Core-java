package assignments;

import java.util.Scanner;

public class CalciScanner {
        int add() {
            System.out.println("GIVE THE VALUE FOR ADDITION :->");
            Scanner addition = new Scanner(System.in);
            System.out.println("Enter the value of a :->");
            int a = addition.nextInt();
            System.out.println("Enter the value of b :->");
            int b = addition.nextInt();
            int result = a + b;
            System.out.println("Addition of a and b :->" + result);
            return result;
        }
        int sub(){
            System.out.println("GIVE THE VALUE FOR SUBSTRACTION :->");
            Scanner subtraction=new Scanner(System.in);
            System.out.println("Enter the value a :->");
           int a=subtraction.nextInt();
            System.out.println("Enter the value of b :->");
            int b=subtraction.nextInt();
            int result=a-b;
            System.out.println("Substraction of a and b :->"+result);
            return result;

        }
        float multi(){
            System.out.println("GIVE THE VALUE FOR MULTIPLICATION :->");
            Scanner multiplication=new Scanner(System.in);
            System.out.println("Enter the value a :->");
           float a=multiplication.nextInt();
            System.out.println("Enter the value of b :->");
           float b=multiplication.nextInt();
            System.out.println("Enter the value of c :->");
           float c=multiplication.nextInt();
            float result=a*b*c;
            System.out.println("Multiplication of a , b and c :->"+result);
            return result;
        }
        float divide(){
            System.out.println("GIVE THE VALUE FOR THE DIVIDE :->");
            Scanner divide=new Scanner(System.in);
            System.out.println("Enter the value of a :->");
            int a=divide.nextInt();
            System.out.println("Enter the value of b");
            int b=divide.nextInt();
            float result=a/b;
            return result;

        }
        public static void main(String[]args){
            CalciScanner calci=new CalciScanner();
            int add=calci.add();
            int sub=calci.sub();
            float multi=calci.multi();
            float divide=calci.divide();

        }

}

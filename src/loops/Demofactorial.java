package loops;

import java.util.Scanner;

public class Demofactorial {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number :->");
        int number=obj.nextInt();
        System.out.println("Enterd number  :"+number);
        int i,fact=1;
        for(i=1;i<=number;i++){
            fact=fact*i;
            System.out.println("factorial is :"+number+" "+fact);
        }
    }
}

package scannerDemo;

import java.util.Scanner;

public class Demoscanner {

    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number :");
        int number=obj.nextInt();
        if (number%2==0){
            System.out.println("Enven number");
        }
        else{
            System.out.println("odd number" );
        }
    }
}

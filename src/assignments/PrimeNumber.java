package assignments;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        System.out.println("Check the number prime or not :->");
        int number=in.nextInt();
        boolean flag=true;//Assuming that input is prime
        // loop through all members between 1 and number
        for(int i=2;i<(number/2);i++){
            if(number%i==0)
                /*if number is divisible by any number
                other than 1 and itself
                It's not prime number
                 */
            {
                flag=false;
                break;
            }
            if(flag==true){
                System.out.println("It's prime number");
            }
            else{
                System.out.println("It's not prime number");
            }

        }

    }
}

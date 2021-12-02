package javaprogram;

public class DemoFactorial {
    public static void main(String[] args) {
        int i,fact =1;
        int number = 5;
        for (i = 1; i <=number; i++) {
          fact = fact * i;
            System.out.println(" factorial is :" + number + " " + fact);
        }
        int j, factorial =1;
        int num=6;
        for(j=1;j<=num;j++){
            factorial = factorial * j;
            System.out.println("factorial is :"+ factorial);
        }
    }

}

package loops;

import java.util.Scanner;

public class Tables {
    //table print from method/function
    public void tables(int a){
        for(int i=1;i<11;i++){
            int result=a*i;
            System.out.println("tables that is you want :"+result);
        }

    }
    public static void main(String[]args){
        //table print from scanner(give input from console)
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter table number you want to :");
        int number= scanner.nextInt();
        for(int i=1;i<11;i++){
            int result=number*i;
            System.out.println(result);
        }
        //table print normal way
        for(int i=1;i<11;i++){
            int two=2;
            int result=two*i;
            System.out.println("TWO'S TABLE :"+result);
        }
        //to create object for method call
        Tables obj=new Tables();
        obj.tables(5);
    }
}

package assignments;

import java.util.Scanner;

public class TableScanner {
    public static void main(String[]args){
        Scanner table=new Scanner(System.in);
        System.out.println("Enter the number that's you want to print table :->");
        int number=table.nextInt();
        for(int i=1;i<=10;i++){
            int result=i*number;
            System.out.println(i +"*" +number +" ="+result);
        }
    }
}

package conditionalStatement;

import java.util.Scanner;

public class ConditionalStatements {
    public String statements(int age){
        String message;
        if(age<10){
            message="this is a child";
        }
        else if(age>10 && age<25){
            message="this is a young";
        }
        else{
            message="this is old";
        }
        return message;
    }
    public static void main(String[]args){
        ConditionalStatements obj=new ConditionalStatements();
        String result=obj.statements(25);
        System.out.println(result);
    }
}

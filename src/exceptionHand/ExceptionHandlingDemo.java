package exceptionHand;

public class ExceptionHandlingDemo {
    public void divid(int a,int b){
        System.out.println("BEFORE DIVIDE");
        try {
            int result = a / b;
            System.out.println("devide result is :"+result);
        }
        catch (Exception E){
            System.out.println("Exception occured...."+E);
        }
        finally{
            System.out.println("finally block execute every time");
        }
    }
    public static void main(String[]args){
        ExceptionHandlingDemo obj=new ExceptionHandlingDemo();
        System.out.println("INSIDE THE METHODE");
        obj.divid(12,0);
        System.out.println("AFTER INSIDE METHODE");
    }
}

package staticKeyword;

public class StaticKeywordWork {
    int a=10; //can not use non static data in static method
    static int value=5;
    public static void display(){
        value=10;
        System.out.println("print static data :"+value);
    }
    public static void main(String[]args){
        System.out.println("static data member call by class reference:"+value);
        StaticKeywordWork.display();
    }
}

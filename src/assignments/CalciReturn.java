package assignments;

public class CalciReturn {
    int a;
    int b;
    public int add(){
        a=9;
        b=5;
        int sum=a+b;
        System.out.println("Addition of two number :->"+sum);
        return sum;
    }
    public int sub(){
        a=12;
        b=14;
        int sub=a-b;
        System.out.println("Substraction of two numbers :->");
        return sub;
    }
    public int multi(){
        a=12;
        b=8;
        int multi=a*b;
        System.out.println("Multiplication of two number :->"+multi);
        return multi;
    }
    public float divide(float a, float b){
        float divide=a/b;
        System.out.println("Divide of two numbers ->"+divide);
        return divide;
    }
    public static void main(String[]args){
        CalciReturn object=new CalciReturn();
        int result=object.add();
        System.out.println(result);
        int out=object.sub();
        System.out.println("Substraction of two number :->"+out);
        int output=object.multi();
        System.out.println("Multiplication :->"+output);
        float result_d=object.divide(12,5);
        System.out.println("Division :->"+result_d);

    }

}

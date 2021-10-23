public class ClassAndObject {
    int a=15;
    int b=3;
    public void add(int a,int b){
        int c;
        c=a+b;
        System.out.println("Add Function with parameter :"+c);
    }
    public void sub(){
        int c;
        c=a-b;
        System.out.println("Sub Function :"+c);
    }
    public void divide(){
        int c=a/b;
        System.out.println("Divide Function :"+c);
    }
    public void multiplication(){
        int c=a*b;
        System.out.println("Multiplication Function :"+c);
    }
    public static void main(String []args){
        ClassAndObject obj=new ClassAndObject();
        obj.sub();
        obj.divide();
        obj.multiplication();
        obj.add(15,15);
    }
}

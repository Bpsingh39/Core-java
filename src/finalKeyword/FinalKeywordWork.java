package finalKeyword;
/*final variable can't be change
   final methode can't be overrriden
   final class can't be inherit*/

public final class FinalKeywordWork {
    String name="RINKUU";
    final int value=5;
    public final void display(){
      //  value=10;
        name="SINGH";
        System.out.println(name);
        System.out.println(value);
    }
    public final void display(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String[]args){
        FinalKeywordWork object=new FinalKeywordWork();
        object.display();
        object.display(7,8);
    }
}

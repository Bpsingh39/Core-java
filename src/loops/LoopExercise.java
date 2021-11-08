package loops;

public class LoopExercise {
    //for loop working
    //Syntax:-for(initialize value;condition;increment/drecrement)
    public void loop(){
        for(int i=0;i<10;i++)
            System.out.println("Namaste : "+i );
        for(int h=10;h>0;h--)
            System.out.println("Coundown : "+h);
    }
    //for eachloop or advanceloop
    //Syntax:-for(data_type variable_name : coolection/array)
    public void advanceloopWorking()
    {
        int [] num= {12,13,14,15,16,17,18,19,20,21,23};
        String [] name={"RAM","SHYAM","SUNDER","KUNDAN"};
        for(int x:num){
            System.out.println("hello : " +x);
        }
        for(String x: name){
            System.out.println(x);
        }
    }
    //Do while loop working
    /*Syntax:-
    initialize value
    while(condition)
    { "hello" }
    i++;
     */
    public void whileWorking(){
        int i=0;
        while(i<10){
            System.out.println("good morning : "+i);
            i++;
        }

    }

    public static void main(String [] args){
        LoopExercise obj=new LoopExercise();
        obj.loop();
        obj.whileWorking();
        obj.advanceloopWorking();
    }
}

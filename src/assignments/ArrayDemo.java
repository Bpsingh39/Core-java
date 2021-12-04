package assignments;

public class ArrayDemo {
    public void arrayInt(){
        int [] marks={12,11,14,55,66,45,54,67,87};
        System.out.println(marks[5]);
        System.out.println(marks[0]);
        System.out.println(marks[6]);
        System.out.println(marks[7]);
        System.out.println(marks[8]);
    }
    public void arrayString(){
        String [] name={"rahul","kuush","jitu","kailash","manoj"};
        for(int i=0;i<name.length;i++){
            System.out.println("Array print from for loop :"+name[i]);

        }
    }
    public void arrayDouble(){
        double [] salary={27559.12,25995.52,29888.45,65585.87};
        for(double monthly:salary){
            System.out.println("Array print from Advance for loop"+monthly);
        }
    }
    public static void main(String[]args){
        ArrayDemo object=new ArrayDemo();
        object.arrayInt();
        object.arrayString();
        object.arrayDouble();
    }
}

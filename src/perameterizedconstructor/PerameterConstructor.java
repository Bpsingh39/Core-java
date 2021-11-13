package perameterizedconstructor;

public class PerameterConstructor{
    String name;
    int roll_num;
    String department;
    //perameterised constructor

    public PerameterConstructor(String name, int roll_num, String department) {
        this.name = name;
        this.roll_num = roll_num;
        this.department = department;
    }
    public void display(PerameterConstructor student){
        student.name="Pramod";
        student.roll_num=20110568;
        student.department="ICA";
        System.out.println("inside the function Student name is :"+student.name);
        System.out.println("inside the function Student rool_number is :"+student.roll_num);
        System.out.println("inside the function Student depatment is :"+student.department);

    }
    public PerameterConstructor getStudent(PerameterConstructor student) {
        student.name = "Hemant";
        student.roll_num = 20110980;
        student.department = "ICA";
        System.out.println("inside the function Student name is :" + student.name);
        System.out.println("inside the function Student rool_number is :" + student.roll_num);
        System.out.println("inside the function Student depatment is :" + student.department);
        return student;
    }

    public static void main(String[]args){
        PerameterConstructor object=new PerameterConstructor("Rinkuu",20110444,"ICA");
        System.out.println("Student name is :"+object.name);
        System.out.println("Student rool_number is :"+object.roll_num);
        System.out.println("Student depatment is :"+object.department);
        object.display(object);
        PerameterConstructor result=object.getStudent(object);
        System.out.println(result);

    }
}

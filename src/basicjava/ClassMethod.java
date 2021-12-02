package basicjava;

public class ClassMethod {
    String Student_name="ATUL";
    int Student_Age=32;
    String Student_department="IT";
    String Student_Section="A";
    public void display(){
        Student_name="Pramod";
        Student_department="TEACHER";
        Student_Age=32;
        Student_Section="B";
        System.out.println("Inside Employee name :"+Student_name);
        System.out.println("inside Employee department :"+Student_department);
        System.out.println("inside employee age :"+Student_Age);
        System.out.println("inside Employee section :"+Student_Section);

    }
    public static void main(String[]args){
        ClassMethod std_record=new ClassMethod();
        System.out.println("Student name :"+std_record.Student_name);
        System.out.println("Student age "+std_record.Student_Age);
        System.out.println("Student department "+std_record.Student_department);
        System.out.println("Student section"+std_record.Student_Section);
        std_record.display();

    }


}

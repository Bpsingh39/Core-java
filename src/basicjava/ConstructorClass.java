package basicjava;

public class ConstructorClass {
    String Employee_name;
    String Employee_department;
    int Employee_age;
    int Employee_id;

    public ConstructorClass(String employee_name, String employee_department, int employee_age, int employee_id) {
        Employee_name = employee_name;
        Employee_department = employee_department;
        Employee_age = employee_age;
        Employee_id = employee_id;
    }

    public static  void main(String[]args){
        ConstructorClass obj=new ConstructorClass("Atul","IT", 32,20110444);
        System.out.println("Employee name"+obj.Employee_name);
        System.out.println("Employee depatment "+obj.Employee_department);
        System.out.println("Employee age "+obj.Employee_age);
        System.out.println("Employee id "+obj.Employee_id);

    }

}

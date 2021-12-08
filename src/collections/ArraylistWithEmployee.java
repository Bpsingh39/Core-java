package collections;

import modelClass.Employee;

import java.util.ArrayList;

public class ArraylistWithEmployee {
    public void demo(){
        //collection <data type> object_name=new collection();
        ArrayList<Employee> employeeArrayList=new ArrayList<>();
        //create Employee object using perameterised constructor
        Employee employee1=new Employee("Rajesh",35,152535.45);
        Employee employee2=new Employee("singh",30,62556.65);
        Employee employee3=new Employee("kailash",28,45216.88);
        Employee employee4=new Employee("chaudhary",33,35215.52);
        Employee employee5=new Employee("jitu",29,85002.44);

        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);
        employeeArrayList.add(employee5);
        for(Employee record:employeeArrayList){
            if(record.getSalary()<36000){
                record.setSalary(45000);
            }
            System.out.println("SHOW EMPLOYEE NAME :"+record.getName());
            System.out.println("SHOW EMPLOYEE AGE :"+record.getAge());
            System.out.println("SHOE EMPLOYEE SALARY :"+record.getSalary());
        }
    }
    public static void main(String[]args){

        ArraylistWithEmployee employee_record=new ArraylistWithEmployee();
        employee_record.demo();
    }
}

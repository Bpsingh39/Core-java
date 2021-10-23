public class PeramerizedConstructor {
    String Firstname;
    String Lastname;
    int age;

    public PeramerizedConstructor(String firstname, String lastname, int age) {
        Firstname = firstname;
        Lastname = lastname;
        this.age = age;
    }
    public static void main(String []args){
        PeramerizedConstructor obj=new PeramerizedConstructor("Dev","Dixit",32);
        System.out.println("Name is "+obj.Firstname);
        System.out.println("Last name is "+obj.Lastname);
        System.out.println("Age is "+obj.age);
    }
}

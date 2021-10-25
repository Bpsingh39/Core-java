public class PeraC {
    String name;
    int rool_no;
    String depatment;

    public PeraC(String name, int rool_no, String depatment) {
        this.name = name;
        this.rool_no = rool_no;
        this.depatment = depatment;
    }
    public void displayinfo(PeraC student){
        System.out.println("inside the name is :"+name);
        System.out.println("inside the rool_no is :"+rool_no);
        System.out.println("inside the deparment is :"+depatment);

    }
    public static void main(String []args){
        PeraC obj=new PeraC("SAKSHAM",20110444,"ICA");
        obj.displayinfo(obj);
    }
}

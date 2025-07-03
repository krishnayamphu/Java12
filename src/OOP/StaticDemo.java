package OOP;
class Student{
    String name;
    static String school_name="Abc School";
    public static void getSchoolAddress(){
        System.out.println("School address:Kumaripati, Lalitpur");
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Student  student=new Student();
        student.name="Hari";
        System.out.println("Name: "+student.name);
        System.out.println("School name:"+ Student.school_name);
        Student.getSchoolAddress();
    }
}

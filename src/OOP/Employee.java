package OOP;

public class Employee {
    private String name;
    public String address;
    double salary;


    public static void main(String[] args) {
       Employee e=new Employee(); // creating an instance (object
       e.name="Ram";
       e.address="Ktm";
       e.salary=2000;

        System.out.println(e.name);
        System.out.println(e.address);
        System.out.println(e.salary);

        e.hello();
    }

    public void hello(){
        System.out.println("Hello World");
    }
}

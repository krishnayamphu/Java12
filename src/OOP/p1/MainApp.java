package OOP.p1;

public class MainApp {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.setName("Kitty");
        cat.setAge(5);

        System.out.println(cat.getName());
        System.out.println(cat.getAge());
    }
}

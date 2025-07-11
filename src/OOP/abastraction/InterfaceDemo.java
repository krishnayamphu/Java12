package OOP.abastraction;
class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Eating meat");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.eat();
    }
}

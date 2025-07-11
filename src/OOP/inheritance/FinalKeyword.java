package OOP.inheritance;
//final
class Cat{
    final public void eat(){
        System.out.println("eating food");
    }

}
public class FinalKeyword extends Cat{
    final int maxSpeed=50;

    public static void main(String[] args) {
        FinalKeyword ob=new FinalKeyword();
//        ob.maxSpeed=60;
        System.out.println("Maximum speed limit: "+ob.maxSpeed);

        ob.eat();
    }

//    @Override
//    public void eat() {
//        System.out.println("eating milk");
//    }
}

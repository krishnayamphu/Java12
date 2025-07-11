package OOP.inheritance;
class Vehicle{
    String brand;
    String color;
    public Vehicle(String vehicle){
        System.out.println("New "+vehicle+" object is created");
    }
    public void test(){
        System.out.println("Testing Vehicle");
    }
}
class Toyota extends Vehicle{
    String model;

    public Toyota(String brand,String color,String model){
        super(model);
        super.brand=brand;
        super.color=color;
        this.model=model;
    }

    public void start(){
        System.out.println("Starting engine.");
        super.test();
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Toyota car=new Toyota("TOYOTA","White","LC 300");
        System.out.println("Brand: "+car.brand);
        System.out.println("Model: "+car.model);
        System.out.println("Color: "+car.color);
    }
}

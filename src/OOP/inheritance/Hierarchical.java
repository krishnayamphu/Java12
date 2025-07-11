package OOP.inheritance;
class Bike{
    String brand;
    String name;
    int engineCapacity;
}
class Honda extends Bike{}
class Yamaha extends Bike{}
public class Hierarchical {
    public static void main(String[] args) {
        Honda honda=new Honda();
        honda.brand="Honda";
        honda.name="CBR 350";
        honda.engineCapacity=350;
        System.out.println(honda.brand);
        System.out.println(honda.name);
        System.out.println(honda.engineCapacity=25);
        System.out.println(honda.engineCapacity=25);

        Yamaha yamaha=new Yamaha();
        yamaha.name="Yamaha MT-15";
        yamaha.brand="YAMAHA";
        yamaha.engineCapacity=155;

        System.out.println("=====================");
        System.out.println(yamaha.name);
        System.out.println(yamaha.brand);
        System.out.println(yamaha.engineCapacity);
    }
}

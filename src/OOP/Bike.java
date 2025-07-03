package OOP;

public class Bike {
    public Bike(){
        System.out.println("default constructor");
    }

    public Bike(String bike){
        System.out.println(bike+" bike is ready to run");
    }
    public static void main(String[] args) {
        Bike bike = new Bike("Pulsar");
    }
}

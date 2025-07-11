package OOP;

public class Car {
    String color;
    int maxSpeed;
    int gear;

    public void initCar(int maxSpeed,int gear){
        this.maxSpeed=maxSpeed;
        this.gear=gear;
    }
    public Car(){
        System.out.println("Car object is created");
    }
    public Car(String color){
        this();
        this.color=color;
    }
    public void start(){
        System.out.println("Starting car");
    }

    public void run(){
        this.start();
        System.out.println("Running car safely...");
    }

    public static void main(String[] args) {
        Car car=new Car("Red");
        car.initCar(140,6);
        System.out.println("Max car speed: "+car.maxSpeed);
        System.out.println("No. of gear: "+car.gear);

        car.run();

        System.out.println("Car color: "+car.color);
    }
}

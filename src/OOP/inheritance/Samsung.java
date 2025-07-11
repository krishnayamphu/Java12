package OOP.inheritance;
class Mobile{
    String brand;
    String model;
}
public class Samsung extends Mobile{
    public static void main(String[] args) {
        Samsung samsung=new Samsung();
        samsung.brand="SAMSUNG";
        samsung.model="S25 Ultra";

        System.out.println(samsung.brand);
        System.out.println(samsung.model);
    }
}

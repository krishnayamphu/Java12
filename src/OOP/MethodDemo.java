package OOP;
class Test{
    public int getMaxSpeed(){
        return 100;
    }
    public void sum(int x,int y){
        System.out.println("Total sum: "+(x+y));
    }

    public double getVat(double amount){
        return (amount*13)/100;
    }
}
public class MethodDemo {
    public static void main(String[] args) {
        Test test=new Test();
        System.out.println("Max highway speed limit: "+test.getMaxSpeed());

        test.sum(10,20);

        System.out.println("VAT: "+test.getVat(5000));
    }
}

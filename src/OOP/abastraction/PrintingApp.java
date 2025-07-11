package OOP.abastraction;

public class PrintingApp extends Printable{
    @Override
    public void print() {
        System.out.println("Printing something");
    }

    public static void main(String[] args) {
        PrintingApp app=new PrintingApp();
        app.print();
    }
}

package exceptions;

public class TryCatchBlock {
    public static void main(String[] args) {
        try {
            System.out.println(20 / 5);
            System.out.println("Hello World");
            int[] num={10,20};
            System.out.println(num[5]);
        }catch (ArithmeticException e){
            System.err.println(e);
            System.err.println("Number can't / by zero.");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
    }
}

package OOP;

public class MethodOverloading {
    void test(){
        System.out.println("Testing something");
    }
    void test(int n){
        System.out.println("Testing "+n);
    }
    void test(String name){
        System.out.println("Testing: "+name);
    }

    public static void main(String[] args) {
        MethodOverloading ob=new MethodOverloading();
        ob.test(10);
        ob.test("Mobile");
    }
}

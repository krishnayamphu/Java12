package basic;

public class Conditional {
    public static void main(String[] args) {
        int x=5, y=6;
        if(x>y){
            System.out.println("x is greater");
        }else{
            System.out.println("y is greater");
        }

        String username="admin";
        String password="a1234";
        if(username=="admin" && password=="a123"){
            System.out.println("login success");
        }else{
            System.out.println("invalid username or password");
        }
    }
}

package OOP.inheritance;
class Shape{
    public void draw(){
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.draw();

        Rectangle rect=new Rectangle();
        rect.draw();
    }
}

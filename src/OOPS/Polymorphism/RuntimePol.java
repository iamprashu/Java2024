package OOPS.Polymorphism;
class Bike{
    int speedLimit = 90;
    void run(){
        System.out.println("Bike is running...");
    }
}
class bullet extends Bike{
    int speedLimit = 890;
    void run(){
        System.out.println("Bullet running");
    }
}

class Shape{
    void draw(){System.out.println("drawing...");}
}
class Rectangle extends Shape{
    void draw(){System.out.println("drawing rectangle...");}
}
class Circle extends Shape{
    void draw(){System.out.println("drawing circle...");}
}
class Triangle extends Shape{
    void draw(){System.out.println("drawing triangle...");}
}

public class RuntimePol {
    public static void main(String[] args){
        Bike bike;
        bike = new bullet();

        bike.run();

        //shapes
        Shape s;
        s = new Rectangle();
        s.draw();//calling method
        s = new Circle();
        s.draw();
        s = new Triangle();
        s.draw();

        bike = new bullet();
        System.out.println(bike.speedLimit);

    }
}

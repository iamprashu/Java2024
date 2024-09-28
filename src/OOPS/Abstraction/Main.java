package OOPS.Abstraction;

abstract class House{
    abstract void method();
}

class room1 extends House{
    void method(){
        System.out.println("Room 1");
    }
}

public class Main {
    public static void main(String[] args){
        room1 r1 = new room1();
        r1.method();
    }
}

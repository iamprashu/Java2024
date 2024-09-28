package OOPS.Polymorphism;

class Hostle{
    void print(){
        System.out.println("Hello Hostle");
    }
}

class room extends Hostle{
    void print(){
        System.out.println("Hello Roommates");
    }
}

public class CompileTime {
    public static void main(String[] args){
        Hostle h1 = new room();

        h1.print();
    }
}

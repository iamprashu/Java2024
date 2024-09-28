package OOPS.Polymorphism.OVERLOADING_OVERRIDING;

class Shank{
    void getAmount(int number1,int number2){
        System.out.println("Sum is "+ (number1 + number2));
    }
    //same name same return type of this function as the upper given function
    //but change in parameter type
    void getAmount(int number1,float number2){
        System.out.println("Sum is "+ (number1 + number2));
    }
}

public class OVERLOADING {
    public static void main(String[] args) {
        Shank num = new Shank();
        num.getAmount(12, (float) 4.7);
    }
}

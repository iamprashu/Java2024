package OOPS;//package OOPS;

public class CopyCons {
    public static void main(String[] args){
        Car bmw = new Car();
        bmw.year=1990;
        bmw.seats = 3;
        bmw.tyres = 4;
        bmw.SetBrand("Bmw Huricane");
    }
}

class Car extends Vehicle{
    int demo[] = new int[2];

}

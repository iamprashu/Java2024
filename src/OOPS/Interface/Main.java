package OOPS.Interface;

interface School{
    int id = 1213344;

    static void homes(){
        System.out.println("Yes it workllll !!!");
    }
}

interface Travels{
    int travelid = 9099818;

    static void idpass(){
        System.out.println("Hello Prashant");
    }
}

class Multiple implements School,Travels{

}

interface boss extends School{

}

public class Main {
    public static void main(String[] args){
        Multiple sch = new Multiple();

        System.out.println(sch.id);
    }
}

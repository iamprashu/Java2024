package OOPS;

class Kalindi{
    int number;
    void kali(){
        System.out.println("Hello Kalindi");
    }
    static class Gold{

        void pri(){
            System.out.println("Hello Gold");
        }
    }
}

public class Nested {
    public static void  main(String[] args){
        Kalindi k = new Kalindi();
        Kalindi.Gold kg = new Kalindi.Gold();

        kg.pri();

    }
}

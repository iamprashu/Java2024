package OOPS.Inheritance;

class btech extends UPES{
    int numberb = 90;
}

class cse extends btech{

}

public class multilevel{
    public static void main(String[] args){
        cse cs = new cse();
        System.out.println(cs.numberb);
    }
}

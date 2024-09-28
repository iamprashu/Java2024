package OOPS.Inheritance;

class UPES{
    static int id = 989880;

    void name(){
        System.out.println("We are UPES, Dehradun");
    }
}

class mca extends UPES{

}

public class Single {
    public static void main(String[] args){
        mca mc = new mca();
        mc.name();
    }
}

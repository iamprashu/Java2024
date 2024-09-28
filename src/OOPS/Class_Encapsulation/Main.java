package OOPS.Class_Encapsulation;

class Bank{
    protected String name;
    protected int Branch_code;
    final int no_of_branches = 10;
}

class HDFC extends Bank{
    private String Manager_name;
    // constructor
    HDFC(){
        System.out.println("this is a non parameterized constructor");
    }
    HDFC(String Manager_name, int Branch_code, String name){
        this.Manager_name = Manager_name;
        this.name = name;
        this.Branch_code = Branch_code;
    }
    void PrintDetails(){
        System.out.println("Name: " + this.Manager_name);
        System.out.println("Branch Code: " + this.Branch_code);
        System.out.println("Bank Name: " + this.name);
    }
}
public class Main {
    public static void main(String[] args) {
        HDFC hdfc = new HDFC("Prashant",1231,"Hdfc");
        hdfc.PrintDetails();
    }
}

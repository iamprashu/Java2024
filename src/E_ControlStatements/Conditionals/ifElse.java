package E_ControlStatements.Conditionals;
import java.util.Scanner;

public class ifElse {
    public static  void main(String args[]){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if((number&1)==1){
            System.out.println("Odd number : ");
        }else{
            System.out.println("Even number : ");
        }
    }

}

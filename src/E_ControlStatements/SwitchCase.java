package E_ControlStatements;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();

        switch(number){
            case 1:
                System.out.println("Yess it is more than 10.");
            case 2:
                System.out.println("Yess it is less than 10.");
        }

    }

}

package E_ControlStatements.Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Number to Print Table ");
        int number = input.nextInt();

        System.out.print("Here is The Table of "+number+" :\n");

        for(int i=1; i<=10; i++){
            System.out.println(number+" X "+ i +" = "+(number*i));
        }
    }
}

package E_ControlStatements.Conditionals;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Select the operation :> \n1.Addition.\n2.Subtraction,\n3.Multiplication,\n4.Division.\n Please Enter Choice Here :> ");
        int operator = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();

        switch (operator){
            case 1: System.out.println("The addition is : " + (a + b));
            break;
            case 2: System.out.println("The subtraction is : " + (a - b));
            break;
            case 3: System.out.println("The multiplication is : " + (a * b));
            break;
            case 4: System.out.println("The division is : " + (a / b));
            break;
        }
    }
}

package F_Methods;
import java.util.Scanner;

public class Methods {
    public static void Sum(int a, int b){
        System.out.println("The addition is :> "+ (a+b));
    }
    public static void Sub(int a, int b){
        System.out.println("The addition is :> "+ (a-b));
    }
    public static void Mul(int a, int b){
        System.out.println("The addition is :> "+ (a*b));
    }
    public static void Div(int a, int b){
        System.out.println("The addition is :> "+ (a/b));
        System.out.println("And the reminder is : "+(a%b));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("Please Select the Right Option :");
            System.out.print("1. Addition\n" +
                    "2. Difference\n" +
                    "3. Product\n" +
                    "4. Division\n" +
                    "0. Exit\nPlease Enter Your Choice :> ");
            int trigger = sc.nextInt();
            if(trigger==0){
                System.out.print("Thank you For Using Calc\n");
                System.out.println("Exiting Program.............");
                break;
            }

            System.out.print("Please Enter 1st Number :> ");
            int num1 = sc.nextInt();
            System.out.print("Please Enter 2nd number :> ");
            int num2 = sc.nextInt();

            switch (trigger) {
                case 1:
                    Sum(num1, num2);
                    break;
                case 2:
                    Sub(num1, num2);
                    break;
                case 3:
                    Mul(num1, num2);
                    break;
                case 4:
                    Div(num1, num2);
                    break;
            }
        }
    }

}

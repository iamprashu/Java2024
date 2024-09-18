package E_ControlStatements;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println((a <= 10) ? "a is greater" : "b is greater");
    }
}

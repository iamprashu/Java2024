import java.util.Scanner;

public class Main {
    public static void Stringinput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Length of square :> ");
        int length = sc.nextInt();

        System.out.println("Enter Hight of square");
        int hight_m = sc.nextInt();

        System.out.println(length*hight_m);

        sc.close();

    }
    public static void main(String[] args){
        Stringinput();
    }
}

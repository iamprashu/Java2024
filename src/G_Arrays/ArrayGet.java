package G_Arrays;
import java.util.Scanner;

public class ArrayGet {
    public static void main(String[] args){
        int array[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0 ;i<array.length; i++){
            System.out.print("Please Enter element for "+i+" th index :> ");
            array[i] = sc.nextInt();
        }

        System.out.println("Thanks for input \n Printing Elements :> ");

        for(int i=0 ;i<array.length; i++){
            System.out.println("Element on  "+i+" st Index is :> "+array[i]);
        }


    }
}

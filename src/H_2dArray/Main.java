package H_2dArray;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int array[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                System.out.print("Please Enter element for "+i+"th row's "+j+" th Index :> ");
                array[i][j]  = sc.nextInt();
            }
        }

        for(int i=0; i<array.length; i++){
            System.out.println("Printing Row No :> "+i);
            for(int j=0; j<array[0].length; j++){
                System.out.println(array[i][j]);
            }
            System.out.print("---------------------------");
        }
    }
}

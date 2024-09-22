package G_Arrays;

public class Array {
    public static void main(String[] args){
        int marks[] = new int[50];
        int number[] = {1,2,3};
        String fruits[] = {"Apple","Banana","Papaya"};
        System.out.println("Size of array is :> "+number.length);
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
    }

}

package OOPS.Consructor;

import java.util.Arrays;

class Bank{
    int number;
    int[] array;

    Bank(){
        array = new int[10];
    }

    Bank(Bank objb){
        //shalow copy
        number = objb.number;
        array = objb.array;
    }
    void Data(){
        System.out.println("Number :> "+number);
        for(int i = 0; i<array.length; i++){
            System.out.print("| "+array[i]);
        }
    }
}

public class ShallowCopy {

    public static void main(String[] args) {
        Bank p = new Bank();
        p.number=12;
        Arrays.fill(p.array, 12);

        p.Data();
        Bank objb = new Bank(p);
        objb.array[9] = 122;
        objb.Data();

        p.Data();

    }

}

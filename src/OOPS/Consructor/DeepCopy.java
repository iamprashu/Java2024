package OOPS.Consructor;

import java.util.Arrays;

class Ban{
    int number;
    int[] array;

    Ban(){
        array = new int[10];
    }

    Ban(Ban objb){
        //Deep  copy
        number = objb.number;
        //array = objb.array;
        array = new int[10];
        for(int i = 0; i<array.length; i++){
          this.array[i] = objb.array[i];
        }
    }
    void Data(){

        System.out.println("Number :> "+number);
        for(int i = 0; i<array.length; i++){
            System.out.print("| "+array[i]);
        }
    }
}
public class DeepCopy {

    public static void main(String[] args) {
        Ban ban = new Ban();
        Ban p = new Ban();
        p.number=12;
        Arrays.fill(p.array, 12);

        p.Data();
        Ban objb = new Ban(p);
        objb.array[9] = 122;
        objb.Data();

        p.Data();
    }
}

package E_ControlStatements.JumpStatements;

public class Breaks {
    public static void main(String[] args){
        int i=10;
        while(i>1){
            System.out.println(i);
            i--;
            if(i == 6){
                break;
            }
        }
    }

}

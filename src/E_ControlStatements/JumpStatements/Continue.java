package E_ControlStatements.JumpStatements;

public class Continue {
    public static void main(String[] args) {
        int i=0;
        while (i <= 5) {
            if (i == 4) {
                i++;
                continue;
                //this will skip 4 as the continue works like this
            }
            System.out.println(i);
            i++;
        }
    }
}

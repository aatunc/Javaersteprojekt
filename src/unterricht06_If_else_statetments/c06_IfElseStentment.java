package unterricht06_If_else_statetments;

import java.util.Scanner;

public class c06_IfElseStentment {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Karekter");
        char src=scan.next().charAt(0);
        if (src>='a' && src<='z'){
            System.out.println((char)(src-32));
        }else {
            System.out.println(src);
        }
    }
}

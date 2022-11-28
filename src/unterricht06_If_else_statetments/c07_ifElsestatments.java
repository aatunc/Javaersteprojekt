package unterricht06_If_else_statetments;

import java.util.Scanner;

public class c07_ifElsestatments {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bitte ein Dreieckige seite eingeben");

        int seit1= scan.nextInt();
        int seit2= scan.nextInt();
        int seit3= scan.nextInt();


        if (seit1<=0 || seit2<=0){
            System.out.println("Es ist nicht Gültig");
        }else if (seit1==seit2 && seit2==seit3){
            System.out.println("Es ist ein Dreieckige");
        }else{
            System.out.println("Es ist keine Dreieckige");

        }
    }
}

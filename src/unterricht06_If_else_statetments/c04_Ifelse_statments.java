package unterricht06_If_else_statetments;

import java.util.Scanner;

public class c04_Ifelse_statments {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihr Alter ein ");
        double alt= scan.nextDouble();

        if (alt>67){
            System.out.println("Ihr alter für Rente ist reich");
        }else{
    }
            System.out.println("Für Rente " + (67-alt) +  "Jahren brauchen Sie noch");

        }
}

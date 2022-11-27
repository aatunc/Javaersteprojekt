package unterricht06_If_else_statetments;

import java.util.Scanner;

public interface c02_ifstatments {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bitte dreieckige gesamte zahlen eingeben");
        int seite1= scan.nextInt();
        int seite2= scan.nextInt();
        int seite3= scan.nextInt();

        if (seite1==seite2 && seite2==seite3){
            System.out.println("Zweizeitige Dreieck");
        } else {
            System.out.println("Keine Zwezeitige Dreick");
        }
    }
}

package tag01_ProgramirenAnfangen;

import java.util.Scanner;

public class c012_scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bitte Ihr Name eingeben");
        String name= scan.nextLine();
        System.out.println("Bitte Nachname Eingeben");
        String nachname= scan.nextLine();
        System.out.println("Bitte Ihre Alter eingeben");
        double alter= scan.nextDouble();
        System.out.println("Name : " + name +"\nnachname : "+nachname+
                "\nalter : "+alter + "\nIhr Anmeldung ist erfolgreich.");
    }
}

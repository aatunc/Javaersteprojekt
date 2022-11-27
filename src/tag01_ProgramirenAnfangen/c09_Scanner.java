package tag01_ProgramirenAnfangen;

import java.util.Scanner;

public class c09_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bitte Name Eingeben");
        String benutzername= scan.next();
        System.out.println(benutzername.toUpperCase());

    }
}

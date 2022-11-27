package tag01_ProgramirenAnfangen;

import java.util.Scanner;

public class c10_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bitte ein Addierren Zahlen eingeben");
        double addierrenzahlen= scan.nextDouble();
        System.out.println("Bitte ein Zahlen eingeben");
        int einzahlen= scan.nextInt();
        System.out.println("Eingebenden zahlen gesamte : " + (addierrenzahlen+einzahlen));
        System.out.println("Eingebenden zahlen malen : " + (addierrenzahlen+einzahlen));

    }
}

package tag01_ProgramirenAnfangen;

import java.util.Scanner;

public class C011_Package {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bitte zwei viertige Ecke bereit eingeben" + "\nzwischen zwei eckige eingeben");
        double kante1= scan.nextDouble();
        double kante2= scan.nextDouble();
        System.out.println("vier Eckige gesamte flache : " +(kante1*kante2));
     }
}

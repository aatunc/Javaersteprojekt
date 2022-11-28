package unterricht_NestedifElseStatments;

import java.util.Scanner;

public class c01_IfElseIfStatment {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bitte als kg geben Sie ein");
        double kg= scan.nextDouble();
        System.out.println("als cm geben sie ihr Lange ein");
        double lange= scan.nextDouble();


        double vke= (kg*1000 / (lange*lange));
        System.out.println("Gewicht : " +vke);

        if (vke>30){
            System.out.println("Obezit");
        } else if (vke>25) {
            System.out.println("mehr Gewicht");


        } else if (vke>20) {
            System.out.println("normal");

        } else if (vke>0) {
            System.out.println("dik");

        }else{
            System.out.println("falsch eingeben");
        }
    }
}

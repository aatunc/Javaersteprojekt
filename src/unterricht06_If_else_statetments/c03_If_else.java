package unterricht06_If_else_statetments;

import java.util.Scanner;

public class c03_If_else {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bitte ein karetkter typen");
        char scr=scan.next().charAt(0);
        if (scr >='A' && scr <= 'Z'){
            System.out.println("Große Buschtaben");
    }else{
            System.out.println("Kein Große Buschtaben");
        }
}}

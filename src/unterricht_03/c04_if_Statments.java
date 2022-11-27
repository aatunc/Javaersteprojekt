package unterricht_03;

import java.util.Scanner;

public class c04_if_Statments {
    public static void main(String[] args) {

        Scanner scann= new Scanner(System.in);

        System.out.println("Bitte geben sie 2 Zahlen");
        int s1= scann.nextInt();
        int s2= scann.nextInt();


        if (s1>100){
            System.out.println("Erst zahl 100 Groß");

        }
        if (s2%2==0){





            System.out.println("Zweite grede zahle");

        }
        if (s1>s2){
            System.out.println("Erste zahl ist groß");
        }
    }
}

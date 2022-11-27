package unterricht06_If_else_statetments;

import java.util.Scanner;

public class c01_ifstatsments {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie month name erste buschtaben ein");
        char ersteBuschtaben = scan.next().charAt(0);
        if (ersteBuschtaben == 'j' || ersteBuschtaben == 'J') {
            System.out.println("Januar");

        }
        if (ersteBuschtaben == 'f' || ersteBuschtaben == 'F') {
            System.out.println("Ferbruar");
        }
        if (ersteBuschtaben == 'm' || ersteBuschtaben == 'M') {
            System.out.println("März");
        }
        if (ersteBuschtaben == 'j' || ersteBuschtaben == 'J') {
            System.out.println("Januar");
        }


    }
}
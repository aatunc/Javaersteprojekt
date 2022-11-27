package unterricht06_If_else_statetments;

import java.util.Scanner;

public class c01_ifstatsments {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie monath Name erstesbuschtaben ein");
        char ersteBuschtaben = scan.next().charAt(0);
        if (ersteBuschtaben == 'j' || ersteBuschtaben == 'J') {
            System.out.println("Januar oder Juni oder Juli");

        }
        if (ersteBuschtaben == 'f' || ersteBuschtaben == 'F') {
            System.out.println("Ferbruar");
        }
        if (ersteBuschtaben == 'm' || ersteBuschtaben == 'M') {
            System.out.println("März oder Mai");
        }
        if (ersteBuschtaben == 'a' || ersteBuschtaben == 'A') {
            System.out.println("August");
        }

        if (ersteBuschtaben == 's' || ersteBuschtaben == 'S') {
            System.out.println("September");}

        if (ersteBuschtaben == 'o' || ersteBuschtaben == 'O') {
            System.out.println("Oktober");}

        if (ersteBuschtaben == 'n' || ersteBuschtaben == 'N') {
            System.out.println("November");}

        if (ersteBuschtaben == 'd' || ersteBuschtaben == 'D') {
            System.out.println("Dezember");}


        }
}
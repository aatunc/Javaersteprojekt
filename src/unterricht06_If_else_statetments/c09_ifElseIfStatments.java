package unterricht06_If_else_statetments;

public class c09_ifElseIfStatments {
    public static void main(String[] args) {

        char geschleht='W';
        int alt=60;

        if (geschleht=='m' && alt>65){
            System.out.println("Rente gehen");
    } else if (geschleht=='m' && alt<65) {
            System.out.println("Für Rente noch " +(65-alt) + "jahre arbeitten sollen" );
        } else if (geschleht=='w' && alt>60) {
            System.out.println("Für Rente noch " + (60-alt) + "jahr arbeiten sollen");

        }else{
            System.out.println("ungultig");
        }

    }
    }

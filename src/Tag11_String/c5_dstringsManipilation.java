package Tag11_String;

public class c5_dstringsManipilation {
    public static void main(String[] args) {
        String email="a@gmail.com";

        if (!email.contains("@")) {

            System.out.println("ungultig");

        }else if (!email.contains("@gmail.com")){
            System.out.println("bitte ein email adresse eingeben");

        }else if (!email.endsWith("@gmail.com")){
            System.out.println("Rechtschreiben fehle");
        }else {
            System.out.println("email hat erfolgreich engemeldet");
        }
    }
    }



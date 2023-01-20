package Tag11_String;

public class c06_indexOf {
    public static void main(String[] args) {
        String str= "Herr Tunc ist beste";

        System.out.println(str.indexOf("T"));// T index bekommen

        System.out.println(str.indexOf('u'));
        System.out.println(str.indexOf("beste"));//
        System.out.println(str.indexOf("e", 13 ));

        String str= "Herr Tunc ist beste man";

        System.out.println(str.indexOf("T"));// T index bekommen

        System.out.println(str.indexOf('u'));
        System.out.println(str.indexOf("beste"));//
        System.out.println(str.indexOf("e", 13 ));

    }
}

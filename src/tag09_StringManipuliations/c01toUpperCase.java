package tag09_StringManipuliations;

import java.util.Locale;

public class c01toUpperCase {
    public static void main(String[] args) {
        String str= "Java ist noch Besser";
        System.out.println(str.toUpperCase());
        System.out.println(str);
        str=str.toUpperCase();

        str="Buch";
        str=str.toUpperCase();
        System.out.println(str);
        //str=str.toLowerCase();
        //System.out.println(str);
        System.out.println(str.toLowerCase(Locale.ENGLISH));
        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));

    }
}

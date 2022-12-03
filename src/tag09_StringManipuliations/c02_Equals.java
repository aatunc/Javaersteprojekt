package tag09_StringManipuliations;

public class c02_Equals {
    public static void main(String[] args) {
        String str1="Rana";
        String str2="rana";

        String str3= new String("Rana");
        String str4= "Rana";
        System.out.println(str1==str2);// false

        System.out.println(str1==str3);// false
        System.out.println(str1==str4);//true
        //bei vergleiche erwartete Ergebnis nicht vorkommen kann.
        //String als equals benutzen
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));

    }
}

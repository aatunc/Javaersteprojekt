package tag09_StringManipuliations;

public class c03_equalsignoreCase {
    public static void main(String[] args) {
        String str1="Rana";
        String str2="rana";
        String str3="RANA";

        System.out.println(str1.equals(str2));// false
        System.out.println(str1.equals(str3));//false
        System.out.println(str1.equalsIgnoreCase("Rana"));

    }
}

package Tag11_String;

public class c02_Contains {
    public static void main(String[] args) {
        String str="Java ist sehr älter";

        System.out.println(str.contains("sehr"));

        System.out.println(str.contains("älter"));

        System.out.println(str.contains("a"));

        //System.out.println(str.contains('s')); //char geht nicht

        System.out.println(str.contains("java"));//false

        String str2="Java";

        System.out.println(str.contains(str2));// true

        String str3="234 Eren Tunc";
        //str3.contains(2); geht nicht

        str3.contains("2");



    }
}

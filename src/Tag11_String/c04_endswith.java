package Tag11_String;

public class c04_endswith {
    public static void main(String[] args) {
        String str="Java ist nicht gut mehr";
        System.out.println(str.endsWith("mehr"));//true
        System.out.println(str.endsWith(""));

        System.out.println(str.endsWith("Java ist nicht gut mehr"));// true

        System.out.println(str.endsWith("Java"));// false

    }
}

package unterricht_03;

public class c01_Concantenation {
    public static void main(String[] args) {
        String s1="Java";
        String s2="Shon";
        String s3= "";
        String s4= " ";

        int zahl1= 4;
        int zahl2= 3;

        System.out.println(zahl2+s3+zahl1+s4+s1);
        System.out.println(zahl1+zahl2+s1+s4+s2);
        System.out.println(s1+s4+s2+zahl1+zahl2);
        System.out.println(s1+s4+s2+s4+zahl1*zahl2);

    }
}

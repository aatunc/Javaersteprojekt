package Tag11_String;

public class c01_Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Schön";
        boolean bl= true;
        int zahl= 20;
        double dbl= 3.54;

        System.out.println(str1+bl+zahl);

        System.out.println(zahl+dbl);


        //System.out.println(str1.concat());
        System.out.println(str1.concat(" ").concat(str2));
    }
}


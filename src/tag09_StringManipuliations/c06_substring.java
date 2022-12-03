package tag09_StringManipuliations;

public class c06_substring {
    public static void main(String[] args) {
        String str= "Java geht nicht mehr";
        System.out.println(str.substring(5));// geht nicht mehr
        System.out.println(str.substring(0));
        System.out.println(str.length());//

        str.charAt(str.length()-1);

        String letzteBuschtabe= ""+str.charAt(str.length()-1);
        System.out.println(letzteBuschtabe);//r

        System.out.println(str.substring(str.length()-1).toUpperCase()); //R

        System.out.println(str.substring(str.length()-3).toUpperCase());
    }

}

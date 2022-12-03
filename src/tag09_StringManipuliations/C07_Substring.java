package tag09_StringManipuliations;

public class C07_Substring {
    public static void main(String[] args) {
        String str= "Java geht nicht mehr als früher";
        System.out.println(str.substring(5, 8));// 5 bis 8 index
        System.out.println(str.substring(3, 7));//

        String name="Eren";

        name= name.substring(0,1).toUpperCase()+
                name.substring(1).toLowerCase();
        System.out.println(name);

        System.out.println(name.substring(2,4));//n
        System.out.println(name.substring(3,4));
        System.out.println(name.substring(2,2));//nichts

        System.out.println(name.substring(1,3));//umgekerht nicht möglich 3, 1



    }
}

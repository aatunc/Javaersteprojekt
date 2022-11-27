package unterricht_03;

public class c02_And_Operator {
    public static void main(String[] args) {
        int a= 20;
        int b= 30;

        System.out.println(a>b && b>0 && a>0); //false
        boolean ergebnes= 3*a <= 2*b && a>10 && b>20;

        System.out.println(ergebnes);
    }
}

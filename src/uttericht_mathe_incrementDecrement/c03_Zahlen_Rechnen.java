package uttericht_mathe_incrementDecrement;

public class c03_Zahlen_Rechnen {
    public static void main(String[] args) {
        int input=1453;
        int ersteZahlen=0;
        int zahlenGesamte=0;
        ersteZahlen = input % 10; //3
        zahlenGesamte= zahlenGesamte+ersteZahlen;//3
        input=input/10;//3
        ersteZahlen= input %10; //3
        zahlenGesamte=zahlenGesamte+ersteZahlen; //8
        input=input % 10;

        input=input/10;//3
        zahlenGesamte=zahlenGesamte+ersteZahlen; //12
        input=input/10;
        input=input/10;//3
        zahlenGesamte=zahlenGesamte+ersteZahlen; //13
        input=input/10;

        System.out.println("Gesamte Zahlen Plus : "+ zahlenGesamte);
    }
}

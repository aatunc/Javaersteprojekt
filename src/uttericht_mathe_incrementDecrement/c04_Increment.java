package uttericht_mathe_incrementDecrement;

public class c04_Increment {
    public static void main(String[] args) {
        int zahl=10 ;
        // wir dieses zahlen 3 plus schreiben
        zahl= zahl+3;
        System.out.println(zahl);
        zahl +=3;
        System.out.println(zahl);
        int s=10;
        s=s+1;
        System.out.println(s);
        ++s;
        System.out.println(s);

        int t=10; //9
        t=t-1;
        t--;//7 post
        --t;//6 pre decrement
        System.out.println(t);



    }
}

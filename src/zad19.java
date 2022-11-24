import java.util.Scanner;
public class zad19 {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);

        double kje;
        kje = ((int)(12467*0.14));

        double psc;
        psc = ((int)(12467*0.64));



        System.out.println("Przybliżona liczbę ankietowanych osób, które kupują przynajmniej jeden napój \n" +
                "energetyczny tygodniowo: " + kje );
        System.out.println("Przybliżona liczbę ankietowanych osób, które preferują napoje energetyczne o \n" +
                "smaku cytrusowym: " + psc );

    }
}

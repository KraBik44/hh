import java.util.Scanner;
public class zad21 {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);

        double p;
        System.out.println("Podaj kwota pierwotnie zdeponowana na koncie: ");
        p = klawiatura.nextInt();
        klawiatura.nextLine();

        double r;
        System.out.println("Podaj roczna stopa oprocentowania: ");
        r = klawiatura.nextInt();
        klawiatura.nextLine();

        int n;
        System.out.println("Podaj ile razy w roku odsetki są doliczane do kapitału: ");
        n = klawiatura.nextInt();
        klawiatura.nextLine();

        int t;
        System.out.println("Podaj liczbe lat: ");
        t = klawiatura.nextInt();
        klawiatura.nextLine();

        double a1;
        a1 = p*(1+r/n);
        double a2;
        a2 = a1+n*t;
        double a3;
        a3 = a1+a2;

        System.out.println("Kwota po latach: " + a3 );

    }
}

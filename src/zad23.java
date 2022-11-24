import java.util.Scanner;
public class zad23 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double r;
        System.out.println("Podaj  długość rzędu w metrach: ");
        r = klawiatura.nextInt();
        klawiatura.nextLine();

        double e;
        System.out.println("Podaj  ilość miejsca zajmowanego przez okratowanie: ");
        e = klawiatura.nextInt();
        klawiatura.nextLine();

        double s;
        System.out.println("Podaj odległość między sadzonkami w metrach: ");
        s = klawiatura.nextInt();
        klawiatura.nextLine();


        double v;
        v = (r - 2 * e) / s;


        System.out.println("Liczba sadzonek w rzędzie: " + v);

    }
}
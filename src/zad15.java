import java.util.Scanner;
public class zad15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

    int cenas;
    System.out.println("Podaj cene produktu");
    cenas = klawiatura.nextInt();
    klawiatura.nextLine();

    double zysk;
    zysk = ((double)cenas*0.4);

    System.out.println("Zysk od ceny " + cenas + " wynosi: " + zysk );
    }
}
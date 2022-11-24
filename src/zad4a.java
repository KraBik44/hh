import java.util.Scanner;
public class zad4a {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double test1;
        System.out.println("Podaj wynik z pierwszego testu: ");
        test1 = klawiatura.nextDouble();
        klawiatura.nextLine();

        double test2;
        System.out.println("Podaj wynik z drugiego testu: ");
        test2 = klawiatura.nextDouble();
        klawiatura.nextLine();

        double test3;
        System.out.println("Podaj wynik z trzeciego testu: ");
        test3 = klawiatura.nextDouble();
        klawiatura.nextLine();

        double st;
        st = (test1 + test2 + test3) / 3;

        System.out.println(+st);

        if (st > 90) {
            System.out.println("5");
        } else if (st > 80 && st < 89) {
            System.out.println("4");

        } else if (st > 70 && st < 79) {
            System.out.println("3");

        } else if (st > 60 && st < 69) {
            System.out.println("2");

        } else if (st < 60) {
            System.out.println("1");

        }
    }
}
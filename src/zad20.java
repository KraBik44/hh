import java.util.Scanner;
public class zad20 {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);

        int cdz;
        System.out.println("Podaj ilość ciasteczek do zrobienia: ");
        cdz = klawiatura.nextInt();
        klawiatura.nextLine();

        double sc;
        sc=(0.03 * cdz);
        double sm;
        sm=(0.02 * cdz);
        double sma;
        sma=(0.05 * cdz);




        System.out.println("Potrzebne szklanki cukru: " + cdz );
        System.out.println("Potrzebne szklanki masła: " + sm );
        System.out.println("Potrzebne szklanki mąki: " + sma );

    }
}

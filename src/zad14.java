import java.util.Scanner;
public class zad14 {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);

        int opt;
        System.out.println("Podaj ocene z pierwszego testu: ");
        opt = klawiatura.nextInt();
        klawiatura.nextLine();

        int odt;
        System.out.println("Podaj ocene z drugiego testu: ");
        odt = klawiatura.nextInt();
        klawiatura.nextLine();

        int ott;
        System.out.println("Podaj ocene z trzeciego testu: ");
        ott = klawiatura.nextInt();
        klawiatura.nextLine();

        double szt;
        szt=((double)(opt + odt + ott)/3);

        System.out.println("Ocenaz pierwszego teestu: " + opt );
        System.out.println("Ocenaz drugiego teestu: " + odt );
        System.out.println("Ocenaz trzeciego teestu: " + ott );
        System.out.println("Średnia ocen z testu: " + szt );
    }
}

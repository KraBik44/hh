import java.util.Scanner;
public class zad17 {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);

        double cp;
        System.out.println("Podaj kwote posiłku: ");
        cp = klawiatura.nextDouble();
        klawiatura.nextLine();

        double podatek;
       podatek = (cp*0.0675);

       double napiwek;
       napiwek = (cp*0.2);

        double suma;
        suma=(cp + podatek + napiwek);

        System.out.println("Cena posiłku: " + cp );
        System.out.println("Podatek: " + podatek );
        System.out.println("Napiwek: " + napiwek );
        System.out.println("Cały koszt: " + suma );
    }
}

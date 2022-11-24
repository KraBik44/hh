import java.util.Scanner;
public class zad18 {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);

        double ca;
        ca = (600*21.77);
        double p;
        p= (ca*0.02);
        double suma;
        suma = ca+p;


        System.out.println("Cena akcji: " +ca);
        System.out.println("Prowizja brokera: " +p);
        System.out.println("Całkowity koszt: " + suma );

    }
}

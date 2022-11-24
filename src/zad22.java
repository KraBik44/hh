import java.util.Scanner;
public class zad22 {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);

        double ca;
        ca = (1000*32.87);
        double p;
        p= (ca*0.02);
        double suma;
        suma = ca+p;
        double sp;
        sp = (1000*33.92);
        double ps;
        ps= sp*0.02;
        double zysk;
        zysk=sp-ca;
        double zysk1;
        zysk1= zysk-(p+ps);

        System.out.println("Cena akcji: " +ca);
        System.out.println("Prowizja brokera: " +p);
        System.out.println("Całkowity koszt: " + suma );
        System.out.println("Cena sprzedzaży: " +sp);
        System.out.println("Prowizja brokera: " +ps);
        System.out.println("Otrzymana kwota: " + zysk );

        if(zysk1<=0){
            System.out.println("Strata");
        }else{
            System.out.println("Zysk: " +zysk1);
        }

    }
}
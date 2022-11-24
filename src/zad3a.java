import java.util.Scanner;
public class zad3a {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);

        double waga;
        System.out.println("Podaj wage: ");
        waga = klawiatura.nextDouble();
        klawiatura.nextLine();

        double wzrost;
        System.out.println("Podaj wzrost: ");
        wzrost = klawiatura.nextDouble();
        klawiatura.nextLine();

        double bmi;
        bmi=waga/(wzrost*wzrost);


        if(bmi>18.5 && bmi<25){
            System.out.println("optymalna waga");
        }else if(bmi<18.5) {
            System.out.println("niedowaga");
        }else if(bmi>25){
            System.out.println("nadwaga");
        }
    }
}

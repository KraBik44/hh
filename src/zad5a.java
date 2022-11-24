import java.util.Scanner;
public class zad5a {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);

        double masa;
        System.out.println("Podaj mase: ");
        masa = klawiatura.nextDouble();
        klawiatura.nextLine();



        double ciezar;
        ciezar= masa*9.8;


        if(ciezar>1000){
            System.out.println("obiekt zbyt ciężki");
        }else if(ciezar<10) {
            System.out.println("obiekt jest zbyt lekki");
        }else if(ciezar){
            System.out.println("nadwaga");
        }
    }
}

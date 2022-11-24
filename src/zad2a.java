import java.util.Scanner;
public class zad2a {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);

        double dzien;
        System.out.println("Podaj dzien: ");
        dzien = klawiatura.nextDouble();
        klawiatura.nextLine();

        double miesiac;
        System.out.println("Podaj miesiac: ");
        miesiac = klawiatura.nextDouble();
        klawiatura.nextLine();

        double rok;
        System.out.println("Podaj dwie ostatnie cyfry roku: ");
        rok = klawiatura.nextDouble();
        klawiatura.nextLine();

      if(miesiac*dzien==rok){
          System.out.println("Data jest magiczna");
      }else {
          System.out.println("Data nie jest magiczna");
      }
    }
}

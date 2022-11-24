import java.util.Scanner;
public class zad16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        String miasto;
        System.out.println("Podaj nazwę ulubionego miasta");
        miasto = klawiatura.nextLine();





        String male, duze;
        male = miasto.toLowerCase();
        duze = miasto.toUpperCase();

        char pl = miasto.charAt(0);

        int dlugosc = miasto.length();

        System.out.println("Podane miasto to: " + miasto);
        System.out.println("Pierwsza litera podanego miasta to: " + pl);
        System.out.println("Liczba znaków w podanej nazwie miasta wynosi: : " + dlugosc);
        System.out.println("Podane miasto dużymi literami: " + duze);
        System.out.println("Podane miasto małymi literami: " + male);
    }
}
import java.util.Scanner;
public class zad1a {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int liczba;
        System.out.println("Podaj liczbe od 1 do 10");
        liczba = klawiatura.nextInt();
        klawiatura.nextLine();

       if(liczba<0 || liczba>10){
           System.out.println("Liczba nie należy do przedziału");
       }
        if(liczba==1){
            System.out.println("I");
        } else if (liczba==2){
            System.out.println("II");
        }else if (liczba==3){
            System.out.println("III");
        }else if (liczba==4){
            System.out.println("IV");
        }else if (liczba==5){
            System.out.println("V");
        }else if (liczba==6){
            System.out.println("VI");
        }else if (liczba==7){
            System.out.println("VII");
        }else if (liczba==8){
            System.out.println("VIII");
        }else if (liczba==9){
            System.out.println("IX");
        }else if (liczba==10){
            System.out.println("X");
        }


    }

    }


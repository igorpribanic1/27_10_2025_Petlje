import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int b;
        int c;



//        if (a>b){
//            System.out.println(a);
//        } else{
//            System.out.println(b);
//        }
        // skraćeni oblik - ternarni operator zamjenjuje gornji if
        // ako je a > b onda će se u varijablu c zapisati vrijednost varijable a
        // ako uvjet NIJE zadovoljen tada će se u varijablu c upisati vrijednost varijable b
        // uvjet može biti napisan (a > b) ili a > b (dakle sa ili bez zagrade - sa zagradom je bolja čitljivost)
//        c = (a > b) ? a : b;
//        System.out.println(c);


        // Kako pročitati korisnički unos podataka na konzoli
        // Prilikom definicje scanner klase import (vidi header) se automatski doda
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Upišite prvi cijeli broj: "); // očekuje se unos cijelog broja
//        a = sc.nextInt();
//        System.out.print("Upišite drugi cijeli broj: "); // očekuje se unos cijelog broja
//        b = sc.nextInt();



        Scanner sc = new Scanner(System.in);
        System.out.println("Upišite prvi cijeli broj: ");
        a = Integer.parseInt(sc.nextLine()); // očekuje se unos cijelog broja, a nextLine() čita String pa je potrebno taj dio parsati
        System.out.println("Upišite drugi cijeli broj: ");
        b = Integer.parseInt(sc.nextLine()); // očekuje se unos cijelog broja, a nextLine() čita String pa je potrebno taj dio parsati
        c = (a > b) ? a : b;
        System.out.println("Veći cijeli broj je: " + c);

        // Kada se scanner više neće koristiti u aplikaciji - prestaje se resurs koristiti i više se ne troši memorijski prostor za njega
        sc.close();

    }
}
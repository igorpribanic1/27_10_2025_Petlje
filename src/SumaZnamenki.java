import java.util.Scanner;

public class SumaZnamenki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj čiju sumu znamenki želiš izračunati:");
        int broj = sc.nextInt();
        int privremeniBroj = Math.abs(broj);
        int sumaZnamenki = 0;

        while(privremeniBroj > 0){
            int zadnjaZnamenka = privremeniBroj % 10; // operator % je modulo tj. ostatak dijeljenja
            sumaZnamenki += zadnjaZnamenka;
            privremeniBroj = privremeniBroj / 10; // cjelobrojno dijeljenje
        }
        System.out.println("Zbroj znamenki broja " + broj + " jednak je: " + sumaZnamenki);
    }
}

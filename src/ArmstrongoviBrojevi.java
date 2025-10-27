public class ArmstrongoviBrojevi {
    public static void main(String[] args) {
        // Armstrongovi brojevi su brojevi koji su jednaki sumi kubova svojih znamenki (do 10.000)
        // Npr. 153 jer je 153 = 1 na 3-ću potenciju + 5 na 3-ću potenciju + 3 na 3-ću potenciju

        for (int i = 1; i < 10000; i++) {
            int privremeniBroj = i;
            int sumaZnamenki = 0;
            while(privremeniBroj > 0){
                int zadnjaZnamenka = privremeniBroj % 10;
                sumaZnamenki += Math.pow(zadnjaZnamenka,3);
                privremeniBroj = privremeniBroj / 10;
            }
            if (i == sumaZnamenki) {
                System.out.println("Armstrongov broj je broj: " + i);
            }
        }
    }
}

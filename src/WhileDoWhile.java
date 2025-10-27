public class WhileDoWhile {
    public static void main(String[] args) {
       int a = 18;
        // while petlja se NE MORA izvršiti - ako uvjet nije zadovoljen jer se on provjerava prije izvršavanja programa
//        while (a < 15){
//            System.out.println(a);
//            a++; // isto kao i da napišemo a=a+1 ili a+=1- povećava se vrijednost varijable za 1
//            // a-- smanjuje vrijiednost varijable a za 1 - kao da napišemo a=a-1 ili a-=1
//        }



        // do petlja se uvijek izvrši BAREM jednom jer se program izvršava prije provjere uvjeta
        do {
            System.out.println(a);
            a++;
        } while (a < 15);






    }
}

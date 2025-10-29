public class ArmstrongoviBrojevi2 {
        public static void main(String[] args) {
            //Zadatak 1:
            //Napišite program koji ispisuje sve Armstrongove brojeve manje od 10000.
            //Armstrongovi brojevi su brojevi koji su jednaki sumi kubova svojih znamenaka.
            //Npr. 153 je Armstrongov broj jer vrijedi (1^{3}+5^{3}+3^{3}=1+125+27=153\)

            for (int i = 1; i < 10000; i++) {
                if (isArmstrong(i)) {
                    System.out.println(i);
                }
            }

            //Zadatak 2:
            //Korištenjem petlje do while izračunaj zbroj brojeva od 1 do 1000 djeljivih sa 7.
            System.out.println("*****************************");

            int broj = 1;
            int zbroj = 0;

            do {
                if (broj % 7 == 0) {
                    zbroj += broj;
                }
                broj++;
            } while (broj <= 10000);
            System.out.println("Zbroj brojeva od 1 do 1000 djeljivih sa 7 je " + zbroj);

        }

        private static boolean isArmstrong(int i) {

            int suma = 0;
            int temp = i;

            while (i > 0) {
                int zZnam = i % 10;
                suma += Math.pow(zZnam, 3);
                i = i / 10;
            }

            return suma == temp;
        }
}

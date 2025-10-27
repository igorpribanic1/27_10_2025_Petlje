public class ZbrojBrojeva {
    public static void main(String[] args) {
        int sumaBrojeva = 0;
        int i = 1;

        do {
            int ostatak = i % 7;
            if (ostatak == 0){
                sumaBrojeva += i;
            }
            i++;
        } while (i <= 10000);

        System.out.println("Suma brojeva djeljivih sa 7 je: " + sumaBrojeva);
    }
}

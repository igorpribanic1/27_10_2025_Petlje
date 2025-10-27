public class ForPetlja {
    public static void main(String[] args) {
        int y = 1;
//        for (int k = 1; k <= 10; k++){ // korak iteracije = 1
//            System.out.println("Broj: " + y + " ispisan: " + k + ". puta!");
//        }

//        for (int k = 1; k <= 10; k+=2){ // korak iteracije = 2
//            System.out.println("Broj: " + y + " ispisan kod varijable k: " + k + ".");
//        }


        // Napredna for petlja (enhanced for)
        int[] godine = {10, 25, 42, 60, 18};
        for(int i : godine){ // prolazi UVIJEK kroz SVE elemente liste (ovdje nema početne i krajnje vrijednosti jer se uvijek gleda CIJELA lista
            System.out.println(i);
        }
    }
}

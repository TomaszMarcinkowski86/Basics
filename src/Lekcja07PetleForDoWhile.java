public class Lekcja07PetleForDoWhile {
    public static void main(String[] args) {

        int i =5;
        int j=5;
        // waruek kontynuacji rób dopóki
        while (i>0){
            System.out.println(i);
            i--;
        }

        System.out.println();

        // Do/while zostanie wykonane przynajmniej raz waruek jest sprawdzany po wykonaniu 1 instrukcji
        do {
            System.out.println(j);
            j--;

        }while (j>0);

        System.out.println();

        for (int a =5; a>0; a--){
            System.out.println(a);
        }

    }
}

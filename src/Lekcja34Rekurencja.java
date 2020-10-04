public class Lekcja34Rekurencja {

    public static void main(String[] args) {

        final int STALA=5;
        long start = System.nanoTime();
        System.out.println(silnia(STALA));
        long elapsed = System.nanoTime()-start;
        System.out.println("czas oblczeń bez rekurencji: " + elapsed);

        System.out.println();

        start = System.nanoTime();
        System.out.println(silniaRekurencja(STALA));
        elapsed = System.nanoTime()-start;
        System.out.println("czas oblczeń rekurencja: " + elapsed);

        }

    private static long silnia(int x) {
        long wynik = 1;
        while (x > 1) {
            wynik *= x;
            x--;
        }
        return wynik;
    }
    private static long silniaRekurencja(int x){
        if(x<=1){
            return 1;
        }else
        return x* silniaRekurencja(x-1);
    }

    }


public class Lekcja11WysyłanieArg {

    public static void main(String[] args) {

        int zmienna =5;
        zmien(zmienna);
        System.out.println(zmienna);

        zmienna=zmien2(zmienna);
        System.out.println(zmienna);

        int[] zmiennaTab={5};
        zmien3(zmiennaTab);
        System.out.println(zmiennaTab[0]);

    }

    public static void zmien(int x){
        x += 5;
        System.out.println("metoda: "+ x);

    }

    public static int zmien2(int x){
        x+=5;
        System.out.println("metoda zmien2: "+ x);
        return x;
    }
    public static void zmien3(int[] x) {
        x[0] += 5;
        System.out.println("metoda zmien3: " + x[0]);
    }

}

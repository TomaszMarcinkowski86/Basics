public class Lekcja10Metody {

    public static void main(String[] args) {
        wyswietl();
        wyswieltString();

        String str = wyswieltString();
        System.out.println(str);

        int wynik =dodaj(5,7);
        System.out.println("metoda przeciążona "+ "wynik metody dodaj = "+ wynik);
        int wynik2 =dodaj(5);
        System.out.println("metoda przeciążona "+ "wynik 2 metody dodaj = "+ wynik2);
        int wynik3 =dodaj();
        System.out.println("metoda przeciążona "+ "wynik 3 metody dodaj = "+ wynik3);
    }

    static void wyswietl(){
        System.out.println("Metoda typu void nic nie zwraca");
    }

    //
    static String wyswieltString(){
        return "Metoda ze typem zwracanym - String zaletą jest że dokonujemy zmian w metodzie, " +
                "wyświetlen może być wiele i ich nie ruszamy";
    }

    //przeiąznie metody - ta sama metoda ale z różną ilością argumentów
    static int dodaj(int a, int b){
        return a+b;
    }

    //przeiąznie metody
    static int dodaj(int a) {
        return ++a;
    }

    //przeiąznie metody
    static int dodaj() {
        return 0;
    }
}

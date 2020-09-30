import java.util.ArrayList;
import java.util.Collections;

public class Lekcja20KolekcjeOperacjeSortowanie {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Poznań");
        lista.add("Warszawa");
        lista.add("Gdańsk");
        lista.add("Szczecin");

        System.out.println();
        for (String e : lista) {
            System.out.println(e);
        }

        // do sortowania możemy użyć collections
        Collections.sort(lista);

        System.out.println("");
        System.out.println("Posortowana lista");
        for (String e : lista) {
            System.out.println(e);
        }

        System.out.println("Collections.min()");
        System.out.println(Collections.min(lista));
        System.out.println("Collection.max()");
        System.out.println(Collections.max(lista));
        System.out.println("Collection.reverse()");
        Collections.reverse(lista);
        for (String e : lista
        ) {
            System.out.println(e);
        }

        System.out.println("Collections.shuffle()");
        Collections.shuffle(lista);
        for (String e : lista
        ) {
            System.out.println(e);
        }

        //Sortowanie listy Genereycznej

        ArrayList<Lekcja20Animal> psy = new ArrayList<Lekcja20Animal>();
        Lekcja20Animal pies = new Lekcja20Animal("burek");
        Lekcja20Animal pies2 = new Lekcja20Animal("pimpek");
        Lekcja20Animal pies3 = new Lekcja20Animal("łatek");
        Lekcja20Animal pies4 = new Lekcja20Animal("pimpek");
        Lekcja20Animal pies5 = new Lekcja20Animal("misiek");

        pies4.wiek = 10;

        psy.add(pies);
        psy.add(pies2);
        psy.add(pies3);
        psy.add(pies4);
        psy.add(pies5);

        System.out.println();
        System.out.println("lista generyczna ");
        for (Lekcja20Animal e : psy
        ) {
            System.out.println(e.name + " ma lat " + e.wiek);

        }

        System.out.println();
        System.out.println("sortowanie generycznej listy");

        // Collections.sort(psy); tym generycznego nie posortujemy klasa Lekcja20Animal
        //jest stworzona przez nas więc musimy zaimplementować interfejs Comparable
        // do klasy Lekcja20Animal

        Collections.sort(psy);
        for (Lekcja20Animal e : psy
        ) {
            System.out.println(e.name + " ma lat " + e.wiek);
        }
    }
}

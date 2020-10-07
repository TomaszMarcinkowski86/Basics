import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Lekcja19KolekcjeMapSet {

    public static void main(String[] args) {


        System.out.println();
        System.out.println("---------hashMap---klucz - wartość-------");

        //HashMap
        HashMap<Integer,String> mapa = new HashMap<>();
        mapa.put(1,"prostokąt");
        mapa.put(2,"koło");
        mapa.put(4,"trójkąt");

        System.out.println(mapa.get(4));
        System.out.println(mapa.get(3));

        System.out.println("------wypisywanie mapy ----------");
        for (String s: mapa.values()) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("-----------HashSet-------------");

        HashSet<String > zbior = new HashSet<>();
        zbior.add("poniedziałek");
        zbior.add("piąteczek");
        zbior.add("sobota");
        zbior.add("sobota");
        zbior.add("sobota");
        zbior.add("niedziela");

        LinkedHashSet<String > zbior2 = new LinkedHashSet<>();
        zbior2.add("poniedziałek");
        zbior2.add("piąteczek");
        zbior2.add("piąteczek");
        zbior2.add("piąteczek");
        zbior2.add("sobota");
        zbior2.add("niedziela");

        System.out.println("Sety nie duplikują tych samych wartości");
        System.out.println("------wypisywanie HashSetu -----nieposortowany-----");
        for (String s: zbior) {
            System.out.println(s);
        }
        System.out.println("------wypisywanie LinkedHasSetu ---posortowany-------");
        for (String s: zbior2) {
            System.out.println(s);
        }
        System.out.println(zbior.size());
    }
}

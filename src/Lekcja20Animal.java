import java.util.Collections;

public class Lekcja20Animal implements Comparable<Lekcja20Animal> {

    public Lekcja20Animal(String name){
        this.name = name;
    }
    String name;
    int wiek = 5;

    // implementujemy interfejs Comparable żeby móc sortować
    // na rzecz compareTo porównujemy już stringi przy takiej konstrukcji
    //jak poniżej porównujemy pole name z tym co przyjdzie jako argument
    // do metody compareTo (o)
//    @Override
//    public int compareTo(Lekcja20Animal o) {
//        return this.name.compareTo(o.name);
//    }

    //sortowanie po 2 argumentach name i wiek
    @Override
    public int compareTo(Lekcja20Animal o) {
        System.out.println(this.name.compareTo(o.name)); // to nam pokazle liczbe porównań
        if (this.name.compareTo(o.name) != 0) {          // !=0 bo 0 gdy 2 elementy są sobie równe tzn 2 Stringi
            return this.name.compareTo(o.name);
        }
        return this.wiek-o.wiek;
    }
}

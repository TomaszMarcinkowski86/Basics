import java.util.ArrayList;

public class Lekcja18KolekcjeLista {

    public static void main(String[] args) {

        Lekcja18Animal animal1 = new Lekcja18Animal("pies");
        Lekcja18Animal animal2 = new Lekcja18Animal("kot");
        Lekcja18Animal animal3 = new Lekcja18Animal("gołąb");
        Lekcja18Animal animal4 = new Lekcja18Animal("tygrys");

        ArrayList list = new ArrayList();
        list.add(animal1);
        list.add(animal2);
        list.add(animal3);
        list.add(animal4);

        // lista generyczna
        ArrayList<Lekcja18Animal> listaGen = new ArrayList<Lekcja18Animal>();
        listaGen.add(animal3);
        listaGen.add(animal2);
        listaGen.add(animal1);
        // listaGen.add(3); błąd!!! Lista generyczna zabezpiecza że musimu obiekty typu Lekcja18Animal
        // metody identyczne jak dla zwykłej listy ale już nie musimy rzutować

        // wyswietlenie listy
        for (Object i: list) {
            System.out.println(((Lekcja18Animal)i).name);// object k rzutujemy na klasę i dopiero z takiego tworu mozemy pobrać imie

        }

        // GENERYCZNA
        for (Lekcja18Animal i: listaGen) {
            System.out.println("generyczna lista: " + (i).name); // Generycznej listy nie muszę rzutować

        }

        System.out.println();
        System.out.println(((Lekcja18Animal)list.get(0)).name);
        System.out.println("generyczna lista: " +((listaGen.get(0)).name)); // GENERYCZNA
        System.out.println(list.size());
        System.out.println(list.contains(animal2));
        System.out.println();
        list.remove(0);
        list.remove(animal4);
        for (Object i: list) {
            System.out.println(((Lekcja18Animal)i).name); // object k rzutujemy na klasę i dopiero z takiego tworu mozemy pobrać imie
        }

        System.out.println(list.size());
        System.out.println();
        list.clear();

        for (Object i: list) {
            System.out.println(((Lekcja18Animal)i).name); // object k rzutujemy na klasę i dopiero z takiego tworu mozemy pobrać imie
        }

        System.out.println(list.size());






    }
}

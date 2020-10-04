public class Lekcja30WIelowatkowosc {

    public static void main(String[] args) {


        System.out.println("------wątki przy pomocy rozszerzenia klasy Thread--------");
        Lekcja30Obliczenia ob1 = new Lekcja30Obliczenia();
        Lekcja30Obliczenia ob2 = new Lekcja30Obliczenia();

// uruchomienie w 1 wątku nawet jak damy 2 razy
//        ob1.run();
//        ob2.run();

        // musimy wystrtować nowy wątek


        ob1.start();
        ob2.start();

        System.out.println("------wątki przy pomocy implementacji interfejsu Runnable------");

        Thread ob3 = new Thread(new Lekcja30Obliczenia2());
        Thread ob4 = new Thread(new Lekcja30Obliczenia2());
        ob3.start();
        ob4.start();

    }
}

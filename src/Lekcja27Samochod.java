public class Lekcja27Samochod extends Lekcja27Pojazd implements Lekcja27PoruszanieSie, Comparable{

    // dziedziczymy po 1 klasie
    // interfejsów mozemy implementować wiele

    Lekcja27Samochod (String nazwa, int iloscKol){
        super(nazwa);
        this.iloscKol=iloscKol;

    }

    public int getIloscKol() {
        return iloscKol;
    }

    int iloscKol;

    @Override
    public void jedzDoPrzodu() {
        System.out.println("jadę do przodu");
    }

    @Override
    public void zatrzymajSie() {
        System.out.println("zatrzymalem sie");

    }

    @Override
    public void skrecaj() {
        System.out.println("skręcam ");
    }

    // nadpisana metoda Interfejsu Comparable - pokazanie że można
    // więcej niż jeden
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

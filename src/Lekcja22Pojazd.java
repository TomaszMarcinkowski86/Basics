public class Lekcja22Pojazd {

    Lekcja22Pojazd(String marka, int iloscKol){
        this.marka=marka;
        this.iloscKol=iloscKol;
        System.out.println("Konstruktor klasy pojazd");
    }
    Lekcja22Pojazd(){
        System.out.println("konstruktor klasy pojazd");
    }

    String marka;
    int iloscKol;

    protected void uruchom(){
        System.out.println("Pojazd został uruchomiony");
    }
}

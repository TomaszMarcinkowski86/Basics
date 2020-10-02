public class Lekcja22Samochod extends Lekcja22Pojazd{

    Lekcja22Samochod(String marka,int iloscKol){
            super(marka, iloscKol );

        System.out.println("Konstruktor klasy samochód");
    }

    boolean otwarty = false;
    void zamknijOtorz(){
        otwarty=!otwarty;
        if(otwarty)
            System.out.println("auto otwarte");
        else
            System.out.println("auto zamknieto");
    }
}

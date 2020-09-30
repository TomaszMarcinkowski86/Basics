public class Lekcja22Samochod extends Lekcja22Pojazd{

    boolean otwarty = false;
    void zamknijOtorz(){
        otwarty=!otwarty;
        if(otwarty)
            System.out.println("auto otwarte");
        else
            System.out.println("auto zamknieto");
    }
}

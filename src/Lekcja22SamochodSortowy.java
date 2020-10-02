
public class Lekcja22SamochodSortowy extends Lekcja22Samochod{


    Lekcja22SamochodSortowy(String marka,int iloscKol){
        super(marka,iloscKol);   //odwołujemy się do konstruktora nadrzędnego
//        super.iloscKol;        // tak odwołujemy się do pól klasy nadrzednej i możemy ją nadpisac
        System.out.println("Konstruktor klasy samochódSportowy");
    }


}

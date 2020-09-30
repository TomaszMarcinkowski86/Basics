public class Lekcja22Dziedziczenie {

    public static void main(String[] args) {

        Lekcja22Samochod auto1 = new Lekcja22Samochod();
        auto1.iloscKol=4;
        auto1.marka="Audi";
        System.out.println("ilość kół: "+auto1.iloscKol + ", marka: "+auto1.marka);

        auto1.uruchom();
        auto1.zamknijOtorz();
        auto1.zamknijOtorz();

        //samochod sportowy

        Lekcja22SamochodSortowy mclaren = new Lekcja22SamochodSortowy();
        mclaren.marka="McLaren";
        mclaren.uruchom();
        mclaren.zamknijOtorz();
        mclaren.zamknijOtorz();
        System.out.println(mclaren.iloscKol + " Sprawdzenie konstruktora z super.iloscKół");



    }
}

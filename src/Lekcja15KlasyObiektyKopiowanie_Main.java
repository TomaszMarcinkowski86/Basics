public class Lekcja15KlasyObiektyKopiowanie_Main {

    //typy proste - kopiujemy ich wartości
    //typy złożone - kopiujemy ich referencje - nie kopiujey obiektu tylko referencje do niego
    public static void main(String[] args) {


        int l = 50;

        // typ prosty jest kopiowany poprzez wartość
        System.out.println("Liczba l przed " + l );
        zmien(l);
        System.out.println("Liczba l po " + l );

        // typy złożone kopiujemy przez referencje do oryginału obiektu.
        Lekcja15_liczba obiektLiczba = new Lekcja15_liczba();
        obiektLiczba.liczba=50;
        System.out.println("Liczba l przed " + obiektLiczba.liczba);
        zmien(obiektLiczba);
        System.out.println("Liczba l po " + obiektLiczba.liczba );
    }

    public static void zmien(int liczba){
        liczba =-1;
 // lokalna zmienściu z metody
    }


    public static void zmien(Lekcja15_liczba obiektLiczba){

        obiektLiczba.liczba = -1;

    }
}

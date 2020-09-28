public class Lekcja14Konstruktory_Osoba {

    static int liczebnosc =0;
    // static tu bedzie powodowć że liczebnosc będzie
    // dla całej klasy raz, tzn będzie się liczyło ile obiektów tego typu bedzie
    //    powstawalo
    String imie;
    int wiek;

    //konstruktor bezargumentowy

    Lekcja14Konstruktory_Osoba(){
    }

    // konstruktor z arumentami

    Lekcja14Konstruktory_Osoba(String imie, int wiek){
        this.imie=imie;
        this.wiek=wiek;


    }
    public void przedstawSie() {
        System.out.println(imie + " ma "+ wiek + " lata");
    }

}

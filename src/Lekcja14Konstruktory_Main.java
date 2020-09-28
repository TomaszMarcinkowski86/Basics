public class Lekcja14Konstruktory_Main {

    public static void main(String[] args) {


        // uzycie konst bezargumentowego do tworzenia obiektu
        Lekcja14Konstruktory_Osoba osoba1 = new Lekcja14Konstruktory_Osoba();
        osoba1.imie="Tomek";
        osoba1.wiek=34;
        System.out.println(osoba1.imie + " ma "+ osoba1.wiek+ " lata");

        // użycie konstr. z argumentami do tworzenia obiektu
        Lekcja14Konstruktory_Osoba osoba2 = new Lekcja14Konstruktory_Osoba("Piotrek", 38);
        osoba2.przedstawSie();

    }

}

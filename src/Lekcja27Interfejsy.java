public class Lekcja27Interfejsy {

    public static void main(String[] args) {

        System.out.println(Lekcja27PoruszanieSie.NAZWA_INTterfejsu);

        Lekcja27Samochod auto1= new Lekcja27Samochod("audi",4);
        auto1.jedzDoPrzodu();
        auto1.skrecaj();
        auto1.skrecaj();
        System.out.println(auto1.getNazwa() + " ma " +auto1.getIloscKol()+ "kola");
    }
}

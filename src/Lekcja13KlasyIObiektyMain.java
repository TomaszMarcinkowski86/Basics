public class Lekcja13KlasyIObiektyMain {
    public static void main(String[] args){

        // obiekt przy użyciu konstruktora domyślnego
        Lekcja13KlasyIObiekty_Zwierze pies= new Lekcja13KlasyIObiekty_Zwierze();

        pies.iloscNog=4;
        pies.glos ="Grrry hou hou";
        pies.imie ="Pies Burek";
        pies.opiszSie();
        pies.dajGlos(4);

        System.out.println();

        //Obiekt utworzony z drugiego konstruktora z argumentmi
        Lekcja13KlasyIObiekty_Zwierze kot = new Lekcja13KlasyIObiekty_Zwierze(4,"Kot Filemon", "miau");
        kot.opiszSie();
        kot.dajGlos(5);
    }

}

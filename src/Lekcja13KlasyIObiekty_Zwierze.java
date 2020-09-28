public class Lekcja13KlasyIObiekty_Zwierze {

    int iloscNog;
    String imie;
    String glos;

    public Lekcja13KlasyIObiekty_Zwierze(int iloscNog, String imie, String glos) {
        this.iloscNog = iloscNog;
        this.imie = imie;
        this.glos = glos;
    }
    public Lekcja13KlasyIObiekty_Zwierze(){

    }

    public void dajGlos(int x){
        for(int i=0; i<x; i++){
            System.out.print(glos);
            System.out.print(" ");
        }
        System.out.println();
    }

    public void opiszSie(){
        System.out.println("Nazywam się " + imie + " i mam "+ iloscNog +" nogi");
    }


}

public class Lekcja26Dog extends Lekcja26Animal{

    String imie;
    Lekcja26Dog(String imie) throws Lekcja26WlasnyExcepion {
        if(imie.length()==0){
            throw new Lekcja26WlasnyExcepion();
        }
    }

    @Override
    void dajGlos() {
        System.out.println("hau hau");
    }

   public void aport(){
        System.out.println("aportuje");
    }
}

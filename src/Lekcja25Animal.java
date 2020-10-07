 public class Lekcja25Animal extends Lekcja25Abstract{

    public void dajGlos(){
        System.out.println("Grrrr");
    }
    final public void metodaFinal(){
        System.out.println("metody final nie nadpiszemy ");
    }


     @Override
     public void dajGlosAbstract() {
         System.out.println("hau hau");
     }
 }

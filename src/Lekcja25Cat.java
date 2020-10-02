public class Lekcja25Cat extends Lekcja25Animal {

    @Override
    public void dajGlos() {
       // super.dajGlos(); to by nam dało "Grrr" bo wywołujemy metodę z klasy nadrzędnej Animal
        System.out.println("miał miał");
    }

//    @Override
//    public void metodaFinal(){
//        tego nie ndapiszemy bo final
//    }

}

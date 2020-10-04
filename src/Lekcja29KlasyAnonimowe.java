public class Lekcja29KlasyAnonimowe {

    public static void main(String[] args) {


        // stworzenie obiektu klasy anonimowej

        Lekcja29Animal cat = new Lekcja29Animal(){

            @Override
            void makeVoice() {
            //    super.makeVoice(); // to korzysta z klasy nadrzędnej
                System.out.println("miau miau");
            }
        };  // tworzymy ciło klasy wewnątrz innej klasy dlatego srednik

        cat.makeVoice();
        
        // inny obiekt klasy Animal
        Lekcja29Animal cat2 = new Lekcja29Animal();
        cat2.makeVoice(); //to znwu trzeba by zrobić jak ta u góry żeby nadpisać


        System.out.println("---------klasa wewnetrzna--inner class----------");

        // jak klasa Pet nie jest statyczna to musimy mieć obiekt klasy wyżej kasy animal
        //i dopiero tak możemy dostać się i utworzyć obiekt klasy Pet
        Lekcja29Animal.Pet pet = cat.new Pet();
        pet.getName();
    }
}

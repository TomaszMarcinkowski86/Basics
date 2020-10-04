

public class Lekcja29Animal {


    void makeVoice(){
        System.out.println("Grrrr");
    }
    void eat(){
        System.out.println("mniam mniam");
    }

    // inner class - klasa wewnetrzna
    class Pet{

        String name;
        void getName(){
            System.out.println(name);

            // możemy wywołać z klasy nadrzednej dowolną metode
            makeVoice();
        }
    }

}

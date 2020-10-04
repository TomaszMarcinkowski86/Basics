public class Lekcja28Enum {

    public static void main(String[] args) {
        Lekcja28Samochod bmw1 = new Lekcja28Samochod("320", Lekcja28Kolory.CZARNY);

        System.out.println(bmw1.model +" ma kolor "+ bmw1.kolor);

        switch (bmw1.kolor){
            case BIALY:
                System.out.println("bialy");
                break;
            case CZARNY:
                System.out.println("czarny");
                break;
        }
    }
}

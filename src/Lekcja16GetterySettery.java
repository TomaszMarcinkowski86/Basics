public class Lekcja16GetterySettery {

    public static void main(String[] args) {

        Lekcja16Uczen u1 = new Lekcja16Uczen();
        u1.setName("Nowak");
        u1.setWzrost(190);

        System.out.println(u1.getName() + " ma " + u1.getWzrost() + " cm wzrostu");
        u1.setName("k"); // nie wykona się bo w seterze mamy logikę która na to nie pozwala
        u1.setWzrost(150);
        System.out.println(u1.getName() + " ma " + u1.getWzrost() + " cm wzrostu");
    }
}

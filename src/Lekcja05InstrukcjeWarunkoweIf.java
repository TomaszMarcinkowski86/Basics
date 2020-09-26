public class Lekcja05InstrukcjeWarunkoweIf {

    public static void main(String[] args) {

        int wiek = 16;

        if (wiek>=18) {
            System.out.println("Osoba pełnoletnia");
            }
        else if (wiek>=16){
            System.out.println("Możesz pracwać");
        }
        else {
            System.out.println("nic nie możesz");
        }

        String imie = (wiek>=18)? "Tomek":"Tomus";
        System.out.println(imie);
    }
}


public class Lekcja26Wyjatki {


    public static void main(String[] args) {

        Lekcja26Animal kot = new Lekcja26Cat();

//        to nie przejdzie bo mamy mechanizm zabezpieczający przed błędem
        // dlatego musimy to wywołać w try{}
//        Lekcja26Animal pies = new Lekcja26Dog("");
//        pies.dajGlos();

        kot.dajGlos();


        try{
            Lekcja26Animal pies = new Lekcja26Dog("");
            ((Lekcja26Cat)pies).aport();
        }catch (ClassCastException e ){
            System.out.println("Błąd uważaj");
            System.out.println(e.getMessage());
        }catch(Lekcja26WlasnyExcepion e) {
            System.out.println("wlasny exeption mozna tak złapać plus obsluga w Dog");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("coś poszło nie tak ale finally i tak się wykona");
        }
        System.out.println("------------");
        try{
            Lekcja26Animal pies = new Lekcja26Dog("");
            pies.dajGlos();
            ((Lekcja26Dog)pies).aport();
            int a= 5/0;
        }catch (ClassCastException e ) {
            System.out.println("Błąd rzutowania");
            System.out.println(e.getMessage());
        }catch (ArithmeticException e) {
            System.out.println("Błąd arytmetyczny Nie dzielimy przez 0");
        }catch(Exception e) {
            System.out.println("błąd dowolny - klasa Exception obsluguje wszystkie bledy" +
                    "wiec i nasz własny też");
            System.out.println(e.getMessage());

        }finally {
            System.out.println("coś poszło nie tak ale finally i tak się wykona");
        }
    }


}

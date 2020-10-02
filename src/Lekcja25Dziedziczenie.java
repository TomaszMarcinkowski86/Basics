public class Lekcja25Dziedziczenie {

    public static void main(String[] args) {

        Lekcja25Animal animal = new Lekcja25Animal();
        animal.metodaFinal();

        // bład!!! nie możemy na bazie klasy abstrakt tworzyć instancji tej klasy
//        Lekcja25Abstract animalAbstract = new Lekcja25Abstract();



        Lekcja25Cat kot =new Lekcja25Cat();
        kot.dajGlos();

        Lekcja25Dog pies = new Lekcja25Dog();
        pies.dajGlos();
        pies.jakasMetoda(); // metoda dostepna bo utworzone na podsawie klasy Dog i przechowywana jako Dog

        //kozystamy zz klasy nadrzednej do utworzenia obiektu
        // po słowku new mozemy użyc klasy narzednej i podrzednej
        //ale odwrotnie sie nie da tzn Dog=newAnimal
        Lekcja25Animal pies2 = new Lekcja25Animal();
        pies2.dajGlos();
//        pies2.jakasMetoda(); niedostepna bo utworzona na podstawie klasy Animal i przechowywana jako Animal
        Lekcja25Animal pies3 = new Lekcja25Dog();
        pies3.dajGlos();
//        pies3.jakasMetoda(); tu tez niedostępna utworzona na bazie klasy Dob ale przechowywana jako Animal
        ((Lekcja25Dog)pies3).jakasMetoda(); // tak można by to naprawić czyli zrzutować na typ Dog

    }

}

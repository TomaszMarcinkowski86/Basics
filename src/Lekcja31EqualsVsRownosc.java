import java.sql.SQLOutput;

public class Lekcja31EqualsVsRownosc {
    public static void main(String[] args) {

        Lekcja31Animal animal1= new Lekcja31Animal();
        Lekcja31Animal animal2= new Lekcja31Animal();

        animal1.name ="Tom";
        animal2.name ="Tom";


        System.out.println("Tom"=="Tom");
        System.out.println(animal1==animal2);
        //niejawne wywołływanie metody super
        // żeby zadziałało trzeba nadpisać metodę equals i hashcode (alt insert)
        System.out.println(animal1.equals(animal2));
    }
}

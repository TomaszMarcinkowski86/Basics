import java.util.Random;
import java.util.Scanner;

public class Lekcja08GraLosuj {

    public static void main(String[] args) {

        int poIluTrafiony = 0;

        int los;
        int odp;

        Random rnd = new Random();
        los =rnd.nextInt(10)+1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe w zakresie od 1 do 10");

        do{
            poIluTrafiony++;
            System.out.println("Podaj liczbę");
            odp = scanner.nextInt();
            if(odp>10||odp<1){
                System.out.println("Podaleś liczbę spoza zakresu");
            }else if (odp>los){
                System.out.println(" Nie zgadłeś! Twoja liczba jest większa :) ");
                }
            else if (odp<los){
                System.out.println(" Nie zgadłeś! Twoja liczba jest mnniejsza :) ");

            }

        }while(odp!=los);
        System.out.println(" Brawo wygrałeś za "+ poIluTrafiony + " razem!");
    }
}

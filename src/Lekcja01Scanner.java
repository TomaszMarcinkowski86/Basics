import java.sql.SQLOutput;
import java.util.Scanner;

public class Lekcja01Scanner {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String okreslFirme;
        System.out.print("Podaj określenie swojej ulubionej firmy: ");
        okreslFirme=scanner.nextLine();

       System.out.println("3D Pro " + okreslFirme);
       System.out.printf("3D Pro %s %d" , okreslFirme, 23); // %s Sting, %d int

    }
}

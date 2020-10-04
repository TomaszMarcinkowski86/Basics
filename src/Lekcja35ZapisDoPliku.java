import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Formatter;
import java.util.Scanner;

public class Lekcja35ZapisDoPliku {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\tomasz_m\\Desktop\\plik.txt");
        if(!f.exists()){
            try {
                f.createNewFile();
                System.out.println("utworzono");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("nie utworzono");
            }
        }
        // sprawdzamy czy mamy prawa zapisu
        if(f.canWrite()){
            try {
                FileWriter fileWriter = new FileWriter(f,true);
                Formatter formatter = new Formatter(fileWriter); // formater działa teraz na fileWriterze - ma więcej możliwości formatowania
                //sam zapis odbywa się przy użyciu fileWritera

                Scanner scannerRead = new Scanner(f);

                Scanner scannerSave = new Scanner(System.in);
                System.out.print("napisz coś co zostanie dodane do pliku");
                String tekstDoZapsu = scannerSave.nextLine();
                System.out.println("Zapisano");

                formatter.format("%s \r\n",tekstDoZapsu);
                formatter.close();
                fileWriter.close();

                System.out.println("----------zawartosc Pliku-----------");
                while (scannerRead.hasNextLine()){
                    System.out.println(scannerRead.nextLine());
                }
                scannerRead.close();
                scannerSave.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

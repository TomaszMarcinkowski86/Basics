import java.util.SortedMap;
 // Typy danych
public class Lekcja02Typy {

    public static void main(String[] args) {


        //Typ Char
        char zmChar = 'a';
        char zmChar2 = ':';
        System.out.println("char = " + zmChar+zmChar2);

        //String

        String text = "Hello";
        String text2 = new String();
        System.out.println(text + text2);

        //boolean

        boolean zmBoolean = true;
        System.out.println(zmBoolean);

        //byte
        byte zmByte = Byte.MIN_VALUE;
        byte zmByt2 = Byte.MAX_VALUE;
        System.out.println("byte(" +zmByte +"-"+zmByt2+")");

        //short
        short zmShort = Short.MIN_VALUE;
        short zmShort2 = Short.MAX_VALUE;
        System.out.println( zmShort +"-"+ zmShort2);

        //int
        int zmInt = Integer.MIN_VALUE;
        int zmInt2 = Integer.MAX_VALUE;
        System.out.println(zmInt + " - "+zmInt2);

        //Long
        long zmLong =Long.MIN_VALUE;
        long zmLong2 = Long.MAX_VALUE;
        System.out.println(zmLong + " - "+zmLong2);

        //float
        float zmFloat = Float.MIN_VALUE;
        float zmFloat2 = Float.MAX_VALUE;
        System.out.println(zmFloat + " - "+ zmFloat2);

        //double
        double zmDouble = Double.MIN_VALUE;
        double zmDouble2 = Double.MAX_VALUE;
        System.out.println(zmDouble + " - "+zmDouble2);

        // stala - stale  dużyc liter dowolny typ słówko final

        final int STALA = 200;
   }
}

public class Lekcja12RzutowanieIKonwersje {


    public static void main(String[] args) {


        short c =25;
        int a= 25;
        int b=a;
        int d=c; // rzutowanie niejawne może zajść jeśli do większej liczby przypiszemy mniejszą
        short e=(short)a;//rzutowanie jawne

        // float a = 5.9f
        // int b= (int) a; - tu stracimy .9 będzie 5

        String liczba = Integer.toString(a);
        String liczba2 = String.valueOf(a);

        System.out.println(liczba);
        System.out.println(liczba2);

        String liczba3 ="33.5";
        double g= Double.parseDouble(liczba3);

        System.out.println("String to double " + g + 33.4);


        b=10;
        System.out.println(a);
    }



}

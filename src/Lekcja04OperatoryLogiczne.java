public class Lekcja04OperatoryLogiczne {

    public static void main(String[] args) {

        int a=6 , b=5;

        boolean logiczna;
        logiczna= a==b;
        logiczna= a<b;
        logiczna= a<=b;
        logiczna= a>b;
        logiczna= a>=b;
        logiczna= a>b && 5<10;
        logiczna = 12>0 || 12<0;

        logiczna = !true;
        logiczna= a!=b;

        System.out.println(logiczna);
    }
}

public class Lekcja03Operatory {

    public static void main(String[] args) {
        int a= 25;
        int b =10;

        double wynik = (double)a/b; //rzutowanie intów a i b na double
        int wynik2 = a % b; //reszta z dzielenia

        int wynik3 =2+2*2;

        a+=b;  // a=a+b; to samo
        a-=b;
        a*=b;
        a/=b;
        a%=b;

        System.out.println(Math.pow(2,3) );
        System.out.println(Math.abs(-50) );

        a++; // a += 1
        a--;

        System.out.println(wynik);
        System.out.println(wynik2);
        System.out.println(wynik3);
        System.out.println(a); //5
        System.out.println(a++); //5
//        System.out.println(a); 6
        System.out.println(++a); //7
    }
}

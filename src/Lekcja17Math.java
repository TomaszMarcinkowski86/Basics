public class Lekcja17Math {

    public static void main(String[] args) {

        int a = -5;
        int b = 10;

        System.out.println("MAX " + Math.max(a,b));
        System.out.println("wartosc bezwzgędna " + Math.abs(a));
        System.out.println("potegowanie " + Math.pow(b, 2));
        System.out.println("pierwiastek " + Math.sqrt(9));
        System.out.println("ceil 5.1 zaokragla w gore: " + Math.ceil(5.6));
        System.out.println("floor 5.1 zaokragla w dol: " + Math.floor(5.6));
        System.out.println("zaokraglanie 5.6: " + Math.round(5.6));
        System.out.println("zaokraglanie 5.5: " + Math.round(5.5));
        System.out.println("zaokraglanie 5.4: " + Math.round(5.4));
        System.out.println("Pi " + Math.PI);
        System.out.println("E " + Math.E);
        System.out.println("random " + Math.random());
    }
}

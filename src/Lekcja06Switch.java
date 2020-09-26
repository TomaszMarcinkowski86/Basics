public class Lekcja06Switch {

    public static void main(String[] args) {

        int poraRoku=77;
        switch (poraRoku){
            case 1:
                System.out.println("Lato");
                break;
            case 2:
                System.out.println("Jesien");
                break;
            case 3:
                System.out.println("Zima");
                break;
            case 4:
                System.out.println("Wiosna");
                break;
            default:
                System.out.println("Wpisałeś błędny numer");

        }
    }
}

public class Lekcja09Tablice {

    public static void main(String[] args) {

        int[] tab2 ={0,3,4,6,7,8,0}; //definicja tabicy i wypłnienie wartościami
        tab2[3]=5; //przypisanie do 4 miejsca piątki

        String[] tab = new String[20]; // def bez wartosci

        tab[0]="Ania";  // ręczne przyisanie wartosci
        tab[1]="Kasia";
        tab[2]="Ola";
        tab[3]="Asia";
        tab[4]="Jagoda";
        tab[5]="Oliwia";
        tab[6]="Maryna";
        tab[7]="Julka";
        tab[8]="Karolina";
        tab[9]="Zosia";

        System.out.println(tab.length);

        System.out.println(tab[8]);
        System.out.println();

        for (int i = 0; i<tab.length; i++) {

            System.out.println(tab[i]);


        }
        //foreach pętla obiektowa

        for (int i: tab2) {

            System.out.println(i);


        }
    }
}

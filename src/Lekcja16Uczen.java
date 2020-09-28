public class Lekcja16Uczen {

    private String nazwisko;
    private int wzrost;

    public String getName() {
        return nazwisko;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setName(String nazwisko) {
        if(nazwisko.length()>=2) {
            this.nazwisko = nazwisko;
        }
    }

    public void setWzrost(int wzrost) {
        if(wzrost>100 && wzrost<220)
        this.wzrost = wzrost;
    }

}

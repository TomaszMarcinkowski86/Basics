public class Lekcja26WlasnyExcepion extends Exception{
    @Override
    public String getMessage() {
        return "Podano jakiś błąd który chcemy obsłużyć";
    }
}

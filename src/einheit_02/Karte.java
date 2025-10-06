package einheit_02;

public enum Karte {


    AS(15), KOENIG(14), DAME(13), BUBE(12), ZEHNER(11);

    private int kartenWert;
    private Karte(int kartenWert){
        this.kartenWert = kartenWert;
    }

    public int getKartenWert(){
        return kartenWert;
    }



}

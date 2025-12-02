package tests.nordpol;
public class Geschenk {
    private final String id;
    private String name;
    private GeschenkTyp typ;
    private double laengeCm, breiteCm, hoeheCm;
    private double preisEuro;

    public Geschenk(String id, String name, GeschenkTyp typ, double l,double b,double h,double preis){
        if(id==null || id.isBlank()) throw new IllegalArgumentException("ID leer");
        this.id=id; this.name=name; this.typ=typ;
        this.laengeCm=l; this.breiteCm=b; this.hoeheCm=h; this.preisEuro=preis;
    }
    public double berechneVolumenKubikmeter(){
        return (laengeCm/100.0)*(breiteCm/100.0)*(hoeheCm/100.0);
    }
    public String getId(){return id;}
    public double getPreisEuro(){return preisEuro;}
}
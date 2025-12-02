package tests.nordpol;
import java.util.*;
public class Schlitten {
    private static int counter=1;
    private static final List<Schlitten> alle=new ArrayList<>();
    private final int nummer;
    private String chauffeur;
    private double ladevolumenKubikmeter;
    private double wertlimitEuro;
    private List<Geschenk> ladung=new ArrayList<>();
    private static final Set<String> globalIDs=new HashSet<>();

    public Schlitten(String chauffeur,double vol,double wert){
        if(vol<5||vol>15) throw new IllegalArgumentException("Volumenbereich falsch");
        this.chauffeur=chauffeur;
        this.ladevolumenKubikmeter=vol;
        this.wertlimitEuro=wert;
        this.nummer=counter++;
        alle.add(this);
    }

    public void beladen(Geschenk g){
        if(g==null) throw new IllegalArgumentException("null");
        if(globalIDs.contains(g.getId())) throw new IllegalArgumentException("Geschenk bereits verladen");
        double neuVol=berechneBelegtesVolumen()+g.berechneVolumenKubikmeter();
        if(neuVol>ladevolumenKubikmeter) throw new IllegalArgumentException("Volumenlimit");
        double neuWert=berechneGesamtwert()+g.getPreisEuro();
        if(neuWert>wertlimitEuro) throw new IllegalArgumentException("Wertlimit");
        ladung.add(g);
        globalIDs.add(g.getId());
    }

    public double berechneBelegtesVolumen(){
        return ladung.stream().mapToDouble(Geschenk::berechneVolumenKubikmeter).sum();
    }
    public double berechneGesamtwert(){
        return ladung.stream().mapToDouble(Geschenk::getPreisEuro).sum();
    }
    public static List<Geschenk> getAlleGeladenenGeschenke(){
        List<Geschenk> all=new ArrayList<>();
        for(Schlitten s:alle) all.addAll(s.ladung);
        return all;
    }
    public void printGeschenkeUebersicht(){
        System.out.println("Schlitten "+nummer+" Ladung:");
        ladung.forEach(g -> System.out.println(" - "+g.getId()));
    }
}
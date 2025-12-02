package tests.weihnachtsmarkt;
import java.util.*;
public class Weihnachtsmarkt {
    private static final Set<String> namen=new HashSet<>();
    private String name;
    private Bundesland bundesland;
    private List<Stadl> stadlListe=new ArrayList<>();

    public Weihnachtsmarkt(String name,Bundesland b){
        if(name==null||name.isBlank()) throw new IllegalArgumentException("Name leer");
        if(namen.contains(name)) throw new IllegalArgumentException("Name existiert");
        this.name=name; this.bundesland=b;
        namen.add(name);
    }

    public boolean addStadl(Stadl s){
        if(s==null) throw new IllegalArgumentException("Stadl null");
        if(stadlListe.contains(s)) throw new IllegalArgumentException("Doppelt");
        return stadlListe.add(s);
    }
}
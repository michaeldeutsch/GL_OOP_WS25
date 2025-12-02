package tests.weihnachtsmarkt;
import java.util.*;
public class Stadl {
    private static int counter=1;
    private final int nummer;
    private Bereich bereich;
    private String betreibername;

    public Stadl(Bereich b,String name){
        this.nummer=counter++;
        this.bereich=b;
        this.betreibername=name;
    }
    public int getNummer(){return nummer;}
}
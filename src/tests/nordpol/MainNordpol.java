package tests.nordpol;
public class MainNordpol {
    public static void main(String[] args){
        Schlitten s1=new Schlitten("Rudolf",10,500);
        Schlitten s2=new Schlitten("Blitzen",12,700);

        Geschenk g1=new Geschenk("G1","Puppe",GeschenkTyp.SPIELZEUG,30,20,15,50);
        Geschenk g2=new Geschenk("G2","Buch",GeschenkTyp.BUCH,20,15,3,20);
        Geschenk g3=new Geschenk("G3","Konsole",GeschenkTyp.ELEKTRONIK,40,30,10,300);
        Geschenk g4=new Geschenk("G4","Socken",GeschenkTyp.SOCKEN,10,5,3,5);

        s1.beladen(g1);
        s1.beladen(g2);
        s2.beladen(g3);

        try{ s2.beladen(g1);}catch(Exception e){ System.out.println(e); }
        try{ s1.beladen(g1);}catch(Exception e){ System.out.println(e); }
        try{
            Geschenk big=new Geschenk("G5","Riesengeschenk",GeschenkTyp.SPIELZEUG,200,200,200,10);
            s1.beladen(big);
        }catch(Exception e){ System.out.println(e); }

        s1.printGeschenkeUebersicht();
    }
}
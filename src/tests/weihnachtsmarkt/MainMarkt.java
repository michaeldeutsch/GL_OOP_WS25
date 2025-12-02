package tests.weihnachtsmarkt;
public class MainMarkt {
    public static void main(String[] args){
        Weihnachtsmarkt m1=new Weihnachtsmarkt("Wiener Markt",Bundesland.WIEN);
        Weihnachtsmarkt m2=new Weihnachtsmarkt("Grazer Markt",Bundesland.STEIERMARK);

        Stadl s1=new Stadl(Bereich.PUNSCH,"Müller");
        Stadl s2=new Stadl(Bereich.SPIELZEUG,"Huber");
        Stadl s3=new Stadl(Bereich.DEKO,"Lehner");

        System.out.println(m1.addStadl(s1));
        System.out.println(m1.addStadl(s2));

        try{ new Weihnachtsmarkt("",Bundesland.WIEN);}catch(Exception e){System.out.println(e);}
        try{
            m1.addStadl(s1);
        }catch(Exception e){System.out.println(e);}
        System.out.println("Programm wurde vollständig ausgeführt.");
    }
}
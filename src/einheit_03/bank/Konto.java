package einheit_03.bank;

public class Konto {

   private String inhaber;
   private double betrag;

    public Konto(String inhaber){
        this.inhaber = inhaber;
        this.betrag = 0;
    }

    public String getInhaber(){
        return inhaber;
    }

    public void setInhaber(String inhaber){

        if(this.inhaber.equals(inhaber)){
            System.out.println("Keine Änderung durchgeführt, da der Kontoinhaber gleich ist");
            return;
        }

        if(inhaber.trim().length() == 0){
            System.out.println("Name darf nicht leer sein");
            return;
        }

        // --- constraints
        System.out.println("Änderung wurde durchgeführt");
        this.inhaber = inhaber;
    }

    public String toString(){
        return "Kontoinhaber " + inhaber + ", Betrag " + betrag;
    }



}

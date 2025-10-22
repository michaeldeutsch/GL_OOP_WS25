package einheit_03.dating;

public class Mann {

    String name;

    public Mann(String name){
        this.name = name;
    }

    public void addPartner(Frau partner){
        if(partnerin == null){
            partnerin = partner;
            System.out.println(name + " hat nun + " + partner.name + " als Partner");
            return;
        }
        System.out.println("Es gibt bereits eine Partnerin");

    }
    public void removePartner(){
        System.out.println("Partnerin " + partnerin.name + " wurde entfernt");

        partnerin = null;
    }

    Frau partnerin;

    public String toString(){
        return "Name " + name + ", Partnerin " + partnerin;
    }

}

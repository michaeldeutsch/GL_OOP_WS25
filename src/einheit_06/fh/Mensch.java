package einheit_06.fh;

import java.time.LocalDate;

public abstract class Mensch {

    private int id;
    private String vName;
    private String nName;
    private LocalDate birthday;

    public Mensch(int id, String vName, String nName, LocalDate birthday) {
        this.id = id;
        this.vName = vName;
        this.nName = nName;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Mensch{" +
                "id=" + id +
                ", vName='" + vName + '\'' +
                ", nName='" + nName + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public void essen(int menge, String nahrung){
        System.out.println(this.vName +" hat gegessen " + nahrung + ", in der Menge " +menge);
    }

    public void essen(int menge){
        System.out.println("Essen");
    }

    public void essen(){
        System.out.println("Essen");
    }
    public  void essen(String nahrung){
        System.out.println();
    }




    public String getvName() {
        return vName;
    }

    public String getnName() {
        return nName;
    }
}

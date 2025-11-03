package einheit_04.mitarbeit;

import java.util.ArrayList;

public class Student {

    private String name;
    ArrayList<Integer> mitarbeit;

    public Student(String name){
        this.name = name;
        this.mitarbeit = new ArrayList<>();
    }

    public String toString(){
        return "Name " + name + ", Mitarbeit " + mitarbeit;
    }

    public void mitarbeitsPunkteHinzufuegen(int punkte){
        mitarbeit.add(punkte);
    }


    public void zeigeSummederMitarbeitspunkte() {
        int erg = 0;

        for(Integer punkte : mitarbeit){
            erg  += punkte;
        }

        if(erg == 0){
            System.out.println(name + " hat noch keine Punkte gesammelt");
            return;
        }
        System.out.println("Ergebnis: " + erg + " von " + name);

    }



}

package einheit_02;

public enum Branche {

    HANDEL(10), INDUSTRIE(15), MISCHFORM(20);

    int branchenZahl;
    private Branche(int branchenZahl){
        this.branchenZahl = branchenZahl;
    }

    public int getBranchenZahl(){

        return branchenZahl;
    }


}

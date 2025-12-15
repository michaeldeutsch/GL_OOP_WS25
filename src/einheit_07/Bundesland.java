package einheit_07;

public enum Bundesland {

    WIEN("Wien"), BGLD("Burgenland"), SBG("Salzburg");

    String name;

    Bundesland(String name) {
        this.name = name;
    }

    public String getName() {
            return  name;
    }
}

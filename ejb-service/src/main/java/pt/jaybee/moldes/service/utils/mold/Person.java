package pt.jaybee.moldes.service.utils.mold;

public enum Person {

    JB("Jaybee"),
    CO("Sr. Constante"),
    SA("Sr. Santos"),
    OU("Outros");

    private String description;

    Person(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

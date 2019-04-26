package decorator;

public class BasicCharacter implements Character {

    private String name;
    private double might;

    public BasicCharacter(String name) {
        this.name = name + " the";
        this.might = 100;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMight() {
        return might;
    }
}

package inheritance;

import java.time.LocalDate;

public class Panda extends Bear {
    static final String colorDescription = "Czarne ubarwienie z białymi paskami i głową";

    public Panda(String name, double weight, LocalDate birthDate) {
        // wywołanie konstruktora klasy bazowej.
        //musi byc jako pierwsza instrukcja konstruktora.
        super(name, weight, birthDate);
        foods = new String[]{"Bambus"};
    }

    @Override
    public String getColor() {
        return "Czarny z białym" + super.getColor();
    }

    @Override
    public String toString() {
        return "Panda{" +
                "name='" + name + '\'' +
                ", weight=" + getWeight() +
                ", birthDate=" + birthDate +
                ", colorDescription='" + colorDescription + '\'' +
                '}';
    }
}

import java.util.Date;

public class Penguin extends Bird {

    public Penguin(String name, Date birthDate, Sex sex, int lifespan, double weight) {
        super(name, birthDate, sex, AnimalType.Penguin, lifespan, weight);
    }

    @Override
    public void Move() {
        System.out.println("Bird Moves");
    }

}

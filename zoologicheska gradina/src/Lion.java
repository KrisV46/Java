import java.util.Date;

public class Lion extends Mammall{
    public Lion(String name, Date birthDate, Sex sex, AnimalType type, int lifespan, double weight) {
        super(name, birthDate, sex, type, lifespan, weight);
    }
    public void Eat()
    {
        super.Eat();
        System.out.println("Lion is eating");
    }
}

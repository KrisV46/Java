import java.util.Date;

public abstract class Bird extends Animal {

    public Bird(String name, Date birthDate, Sex sex, AnimalType type, int lifespan, double weight) {
        super(name, birthDate, sex, type, lifespan, weight);
    }

    @Override
    public void Move() {
        System.out.println("Bird Moves");
    }
    public void Fly() {
        System.out.println("Bird Flies");
    }

    @Override
    public void Eat() {
        System.out.println("Bird Eats");
    }

    @Override
    public void Sleep() {
        System.out.println("Bird Sleeps");
    }

    @Override
    public void Reproduce() {
        System.out.println("Bird Sexes");
    }

    @Override
    public void Die() {
        System.out.println("Bird Dies");
    }
}

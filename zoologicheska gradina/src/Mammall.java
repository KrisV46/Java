import java.util.Date;

public  class Mammall extends Animal{
    public Mammall(String name, Date birthDate, Sex sex, AnimalType type, int lifespan, double weight) {
        super(name, birthDate, sex, type, lifespan, weight);
    }
    @Override
    public void Move()
    {
        System.out.println("Moves");
    }
    @Override
    public void Eat()
    {
        System.out.println("Mammal Eats");
    }
    @Override
    public void Sleep()
    {
        System.out.println("Mammal Sleeps");
    }
    @Override
    public void Reproduce()
    {
        System.out.println("Mammal Reproduces");
    }
    @Override
    public void Die()
    {
        System.out.println("Mammal Dies");
    }
}

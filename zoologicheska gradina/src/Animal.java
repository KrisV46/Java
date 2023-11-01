import java.util.Date;

public abstract class Animal {
    private String name;
    private Date birthDate;
    private Sex sex;
    private AnimalType type;
    private int lifespan;
    private double weight;

    public Animal(String name,Date birthDate,Sex sex,AnimalType type,int lifespan,double weight)
    {
        this.name=name;
        this.birthDate=birthDate;
        this.sex=sex;
        this.type=type;
        this.lifespan=lifespan;
        this.weight=weight;
    }
    public String getName() {
        return name;
    }
    public Date getBirthDate()
    {
        return birthDate;
    }
    public Sex getSex() {
        return sex;
    }
    public AnimalType getType() {
        return type;
    }
    public int getLifespan() {
        return lifespan;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract void Move();
    public abstract void Eat();
    public abstract void Sleep();
    public abstract void Reproduce();
    public abstract void Die();

}

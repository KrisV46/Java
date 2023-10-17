public class Car {
    public String brand;
    public int speed;
    public double fuel;
    public int mileage;

    public Car(String brand, int speed, double fuel, int mileage){
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
        this.mileage = mileage;
    }
    public void accelerate(){
        speed += 20;
    }
    public void refuel(double WholeFuel){
        fuel += WholeFuel;
    }
    public void drive(int distance) {
        mileage += distance;
        fuel -= (distance / 10.0);
    }
}

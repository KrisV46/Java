public class ElectricCar extends Car{
    public double batteryLevel;
    public double efficiency;
    public ElectricCar(String brand, int speed, double efficiency) {
        super(brand, speed, 0, 0);
        this.efficiency = efficiency;
        this.batteryLevel = 100.0;
    }
}

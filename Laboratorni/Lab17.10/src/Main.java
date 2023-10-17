public class Main {
    public static void main(String[] args) {
        Person chovek = new Person(20, "Кристиан");
        Student studentche = new Student(20, "Кристиан", 6);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Car myCar = new Car("Opel", 100, 11.0, 10);
        //chovek.sayHello();
        //studentche.sayHello2();
        chovek.printDetails();
        studentche.printDetails();
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        myCar.accelerate();
        System.out.println("Accelerate speed: " + myCar.speed);
        myCar.refuel(20.0);
        System.out.println("After refueling: " + myCar.fuel);
        myCar.drive(100);
        System.out.println("Distance travelled: " + myCar.mileage);
        System.out.println("Left fuel after driving: " + myCar.fuel);
    }
}
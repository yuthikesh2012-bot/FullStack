package Day_3;

class Vehicle {
    String brand;
    int speed;
    public Vehicle(String b, int s){
        this.brand = b;
        this.speed = s;
    }
}
class Car extends Vehicle{
    int doors;
    public Car (String b, int s, int d){
        super(b, s);
        this.doors = d;
    }
}
public class CarInheritance{
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 120, 4);
        System.out.println("Car Brand: " + myCar.brand);
        System.out.println("Car Speed: " + myCar.speed + "km/h");
        System.out.println("No.of Doors: " + myCar.doors);
    }
}
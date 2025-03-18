public interface Drivable {
public void drive();
}

public interface Flyable {
public void fly();
}

public class Vehicle {
public void displayInfo() {
System.out.println("Basic Vehicle Information");
}
}

public class Car extends Vehicle implements Drivable {
public void drive() {
System.out.println("Car Driving on Road");
}

public void honk() {
System.out.println("Car Honking Horn");
}
}

public class Airplane extends Vehicle implements Flyable {
public void fly() {
System.out.println("Airplane Flying in Sky");
}

public void landing() {
System.out.println("Airplane Landing on Runway");
}
}

public class FlyingCar extends Vehicle implements Drivable, Flyable {
public void drive() {
System.out.println("Flying Car Driving on Road");
}

public void fly() {
System.out.println("Flying Car Flying in Sky");
}

public void transform() {
System.out.println("Flying Car Transforming Mode");
}
}

public class VehicleMain {
public static void main(String[] args) {
System.out.println("Regular Car");
Car car = new Car();
car.displayInfo();
car.drive();
car.honk();

System.out.println("Airplane ");
Airplane plane = new Airplane();
plane.displayInfo();
plane.fly();
plane.landing();

System.out.println("Flying Car");
FlyingCar flyingCar = new FlyingCar();
flyingCar.displayInfo();
flyingCar.drive();
flyingCar.fly();
flyingCar.transform();
}
}

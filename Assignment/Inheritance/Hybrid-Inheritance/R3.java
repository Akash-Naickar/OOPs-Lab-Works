public class Vehicle {
public void displayVehicleInfo() {
System.out.println("Basic Vehicle Information");
}
}

public class LandVehicle extends Vehicle {
public void drive() {
System.out.println("Land Vehicle Driving");
}
}

public class WaterVehicle extends Vehicle {
public void sail() {
System.out.println("Water Vehicle Sailing");
}
}

public class Car extends LandVehicle {
public void honk() {
System.out.println("Car Honking");
}
}

public class Motorcycle extends LandVehicle {
public void wheelie() {
System.out.println("Motorcycle Wheelie");
}
}

public class Boat extends WaterVehicle {
public void anchor() {
System.out.println("Boat Anchoring");
}
}

public class Submarine extends WaterVehicle {
public void dive() {
System.out.println("Submarine Diving");
}
}

public class VehicleMain {
public static void main(String[] args) {
System.out.println("Car");
Car car = new Car();
car.displayVehicleInfo();
car.drive();
car.honk();

System.out.println("Motorcycle");
Motorcycle motorcycle = new Motorcycle();
motorcycle.displayVehicleInfo();
motorcycle.drive();
motorcycle.wheelie();

System.out.println("Boat");
Boat boat = new Boat();
boat.displayVehicleInfo();
boat.sail();
boat.anchor();

System.out.println("Submarine");
Submarine submarine = new Submarine();
submarine.displayVehicleInfo();
submarine.sail();
submarine.dive();
}
}

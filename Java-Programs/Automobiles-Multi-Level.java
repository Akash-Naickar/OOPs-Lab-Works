class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    String fuelType;

    public Car(String brand, int speed, String fuelType) {
        super(brand, speed);   // Used to call the immediate parent class constructor (ie: Vehicle)
        this.fuelType = fuelType;
    }

    void showCarDetails() {
        displayDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    public ElectricCar(String brand, int speed, String fuelType, int batteryCapacity) {
        super(brand, speed, fuelType);    // Used to call the immediate parent class constructor (ie: Car)
        this.batteryCapacity = batteryCapacity;
    }

    void showElectricCarDetails() {
        showCarDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricCar myTesla = new ElectricCar("Tesla", 250, "Electric", 100);
        System.out.println("Electric Car Details:");
        myTesla.showElectricCarDetails();
    }
}

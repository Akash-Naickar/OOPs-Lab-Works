public class Automobile {
public void Accelerate() {
System.out.println("Vehicle is Accelerating!");
}
}

public class SuperCar extends Automobile{
public void deAccelerate(){
System.out.println("Super car is de-accelerating!");
}
}

public class Main{
public static void main(String[] args){
SuperCar mine = new SuperCar();
mine.Accelerate();
mine.deAccelerate();
}
}

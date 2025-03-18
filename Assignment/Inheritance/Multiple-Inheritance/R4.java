public interface FlightCapable {
public void fly();
}

public interface SuperStrength {
public void useSuperStrength();
}

public interface ElementControl {
public void controlElement();
}

public class Superhero {
public void displayIdentity() {
System.out.println("Hero Identity Information");
}
}

public class Superman extends Superhero implements FlightCapable, SuperStrength {
public void fly() {
System.out.println("Superman flies through the air");
}

public void useSuperStrength() {
System.out.println("Superman uses super strength");
}

public void heatVision() {
System.out.println("Superman uses heat vision");
}
}

public class Thor extends Superhero implements FlightCapable, SuperStrength, ElementControl {
public void fly() {
System.out.println("Thor flies with Mjolnir");
}

public void useSuperStrength() {
System.out.println("Thor uses godly strength");
}

public void controlElement() {
System.out.println("Thor controls lightning");
}

public void summonWeapon() {
System.out.println("Thor summons Mjolnir");
}
}

public class Spiderman extends Superhero implements SuperStrength {
public void useSuperStrength() {
System.out.println("Spiderman uses proportional strength of a spider");
}

public void shootWeb() {
System.out.println("Spiderman shoots web");
}

public void spiderSense() {
System.out.println("Spiderman uses spider sense");
}
}

public class HeroMain {
public static void main(String[] args) {
System.out.println("Superman");
Superman superman = new Superman();
superman.displayIdentity();
superman.fly();
superman.useSuperStrength();
superman.heatVision();

System.out.println("Thor");
Thor thor = new Thor();
thor.displayIdentity();
thor.fly();
thor.useSuperStrength();
thor.controlElement();
thor.summonWeapon();

System.out.println("Spiderman");
Spiderman spiderman = new Spiderman();
spiderman.displayIdentity();
spiderman.useSuperStrength();
spiderman.shootWeb();
spiderman.spiderSense();
}
}

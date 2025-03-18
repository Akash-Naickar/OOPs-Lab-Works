public class SpiderPowers {
public void displaySpiderSense() {
System.out.println("Spider-Sense: Danger detection");
}
}

public class PeterParker extends SpiderPowers {
public void displayAbilities() {
System.out.println("Primary: Web Shooter");
System.out.println("Secondary: Web Swinging");
System.out.println("E: Spider Grip");
System.out.println("Q: Spectacular Spin");
}
}

public class MilesMorales extends SpiderPowers {
public void displayAbilities() {
System.out.println("Primary: Venom Strike");
System.out.println("Secondary: Web Shooter");
System.out.println("E: Camouflage");
System.out.println("Q: Mega Venom Blast");
}
}

public class GwenStacy extends SpiderPowers {
public void displayAbilities() {
System.out.println("Primary: Ballet Combat");
System.out.println("Secondary: Web Shooter");
System.out.println("E: Ghost-Spider");
System.out.println("Q: Dimensional Leap");
}
}

public class SpiderMain {
public static void main(String[] args) {
System.out.println("Peter Parker");
PeterParker peter = new PeterParker();
peter.displaySpiderSense();
peter.displayAbilities();

System.out.println("Miles Morales");
MilesMorales miles = new MilesMorales();
miles.displaySpiderSense();
miles.displayAbilities();

System.out.println("Gwen Stacy");
GwenStacy gwen = new GwenStacy();
gwen.displaySpiderSense();
gwen.displayAbilities();
}
}

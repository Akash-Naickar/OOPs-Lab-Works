public class SuperPower {
public void displayOrigin() {
System.out.println("Super Power Origin");
}
}

public class ElementalPower extends SuperPower {
public void elementalControl() {
System.out.println("Control of Elements");
}
}

public class PhysicalPower extends SuperPower {
public void enhancedStrength() {
System.out.println("Enhanced Physical Capabilities");
}
}

public class FirePower extends ElementalPower {
public void flameThrower() {
System.out.println("Q: Flame Thrower");
System.out.println("E: Fire Blast");
}
}

public class IcePower extends ElementalPower {
public void freezeRay() {
System.out.println("Q: Freeze Ray");
System.out.println("E: Ice Wall");
}
}

public class SuperStrength extends PhysicalPower {
public void mightyPunch() {
System.out.println("Q: Mighty Punch");
System.out.println("E: Ground Slam");
}
}

public class SuperSpeed extends PhysicalPower {
public void speedDash() {
System.out.println("Q: Speed Dash");
System.out.println("E: Whirlwind");
}
}

public class PowerMain {
public static void main(String[] args) {
System.out.println("Fire Hero");
FirePower fire = new FirePower();
fire.displayOrigin();
fire.elementalControl();
fire.flameThrower();

System.out.println("Ice Hero");
IcePower ice = new IcePower();
ice.displayOrigin();
ice.elementalControl();
ice.freezeRay();

System.out.println("Strong Hero");
SuperStrength strength = new SuperStrength();
strength.displayOrigin();
strength.enhancedStrength();
strength.mightyPunch();

System.out.println("Fast Hero");
SuperSpeed speed = new SuperSpeed();
speed.displayOrigin();
speed.enhancedStrength();
speed.speedDash();
}
}

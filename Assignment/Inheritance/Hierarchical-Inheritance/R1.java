public class HeroBase {
public void displayInfo() {
System.out.println("Basic Hero Information");
}
}

public class DamageHero extends HeroBase {
public void displayAbility() {
System.out.println("Ultimate: Final Judgment");
System.out.println("Passive: Critical Strike");
}
}

public class TankHero extends HeroBase {
public void displayAbility() {
System.out.println("Ultimate: Impenetrable Shield");
System.out.println("Passive: Regeneration");
}
}

public class SupportHero extends HeroBase {
public void displayAbility() {
System.out.println("Ultimate: Mass Heal");
System.out.println("Passive: Mana Restoration");
}
}

public class HeroMain {
public static void main(String[] args) {
System.out.println("Damage Hero");
DamageHero damage = new DamageHero();
damage.displayInfo();
damage.displayAbility();

System.out.println("Tank Hero");
TankHero tank = new TankHero();
tank.displayInfo();
tank.displayAbility();

System.out.println("Support Hero");
SupportHero support = new SupportHero();
support.displayInfo();
support.displayAbility();
}
}

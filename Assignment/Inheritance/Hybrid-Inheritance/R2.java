public class GameAbility {
public void displayBaseInfo() {
System.out.println("Basic Ability Information");
}
}

public class AttackAbility extends GameAbility {
public void attack() {
System.out.println("Basic Attack Function");
}
}

public class DefenseAbility extends GameAbility {
public void defend() {
System.out.println("Basic Defense Function");
}
}

public class MeleeAttack extends AttackAbility {
public void swingSword() {
System.out.println("Press Left-mouse for Sword Swing");
}
}

public class RangedAttack extends AttackAbility {
public void fireArrow() {
System.out.println("Press Left-mouse for Arrow Shot");
}
}

public class ShieldDefense extends DefenseAbility {
public void raiseShield() {
System.out.println("Press Right-mouse for Shield Block");
}
}

public class MagicWard extends DefenseAbility {
public void castBarrier() {
System.out.println("Press Right-mouse for Magic Barrier");
}
}

public class AbilityMain {
public static void main(String[] args) {
System.out.println("Melee Attack");
MeleeAttack melee = new MeleeAttack();
melee.displayBaseInfo();
melee.attack();
melee.swingSword();

System.out.println("Ranged Attack");
RangedAttack ranged = new RangedAttack();
ranged.displayBaseInfo();
ranged.attack();
ranged.fireArrow();

System.out.println("Shield Defense");
ShieldDefense shield = new ShieldDefense();
shield.displayBaseInfo();
shield.defend();
shield.raiseShield();

System.out.println("Magic Defense");
MagicWard magic = new MagicWard();
magic.displayBaseInfo();
magic.defend();
magic.castBarrier();
}
}

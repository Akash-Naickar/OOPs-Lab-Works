public interface Attacker {
public void attack();
}

public interface Defender {
public void defend();
}

public class Character {
public void displayInfo() {
System.out.println("Basic Character Information");
}
}

public class Warrior extends Character implements Attacker, Defender {
public void attack() {
System.out.println("Warrior Attack with Sword");
}

public void defend() {
System.out.println("Warrior Defend with Shield");
}

public void battleCry() {
System.out.println("Warrior Battle Cry");
}
}

public class Mage extends Character implements Attacker, Defender {
public void attack() {
System.out.println("Mage Attack with Magic");
}

public void defend() {
System.out.println("Mage Defend with Barrier");
}

public void castSpell() {
System.out.println("Mage Cast Arcane Spell");
}
}

public class MultipleMain {
public static void main(String[] args) {
System.out.println("Warrior Character");
Warrior warrior = new Warrior();
warrior.displayInfo();
warrior.attack();
warrior.defend();
warrior.battleCry();

System.out.println("Mage Character");
Mage mage = new Mage();
mage.displayInfo();
mage.attack();
mage.defend();
mage.castSpell();
}
}

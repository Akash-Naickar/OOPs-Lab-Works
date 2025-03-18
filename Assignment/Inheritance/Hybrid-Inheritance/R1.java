public class Character {
public void displayInfo() {
System.out.println("Basic Character Information");
}
}

public class Fighter extends Character {
public void fight() {
System.out.println("Basic Fighting Ability");
}
}

public class Mage extends Character {
public void castSpell() {
System.out.println("Basic Magic Ability");
}
}

public class Warrior extends Fighter {
public void battleCry() {
System.out.println("Warrior Battle Cry");
}
}

public class Berserker extends Fighter {
public void rage() {
System.out.println("Berserker Rage");
}
}

public class Wizard extends Mage {
public void arcaneBlast() {
System.out.println("Wizard Arcane Blast");
}
}

public class Warlock extends Mage {
public void summonDemon() {
System.out.println("Warlock Demon Summoning");
}
}

public class HybridMain {
public static void main(String[] args) {
System.out.println("Warrior Character");
Warrior warrior = new Warrior();
warrior.displayInfo();
warrior.fight();
warrior.battleCry();

System.out.println("Berserker Character");
Berserker berserker = new Berserker();
berserker.displayInfo();
berserker.fight();
berserker.rage();

System.out.println("Wizard Character");
Wizard wizard = new Wizard();
wizard.displayInfo();
wizard.castSpell();
wizard.arcaneBlast();

System.out.println("Warlock Character");
Warlock warlock = new Warlock();
warlock.displayInfo();
warlock.castSpell();
warlock.summonDemon();
}
}

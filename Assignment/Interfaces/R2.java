public interface Offensive {
public void attackAbility();
}

public interface Defensive {
public void defenseAbility();
}

public interface Mobility {
public void movementAbility();
}

public class GameCharacter {
public void displayStats() {
System.out.println("Character Base Stats");
}
}

public class Knight extends GameCharacter implements Offensive, Defensive {
public void attackAbility() {
System.out.println("Knight uses Sword Slash");
}

public void defenseAbility() {
System.out.println("Knight uses Shield Wall");
}

public void specialAbility() {
System.out.println("Knight uses Rally Cry");
}
}

public class Ranger extends GameCharacter implements Offensive, Mobility {
public void attackAbility() {
System.out.println("Ranger uses Arrow Shot");
}

public void movementAbility() {
System.out.println("Ranger uses Quick Step");
}

public void specialAbility() {
System.out.println("Ranger uses Eagle Eye");
}
}

public class Paladin extends GameCharacter implements Offensive, Defensive, Mobility {
public void attackAbility() {
System.out.println("Paladin uses Holy Strike");
}

public void defenseAbility() {
System.out.println("Paladin uses Divine Shield");
}

public void movementAbility() {
System.out.println("Paladin uses Charge");
}

public void ultimateAbility() {
System.out.println("Paladin uses Divine Intervention");
}
}

public class AbilityMain {
public static void main(String[] args) {
System.out.println("Knight ");
Knight knight = new Knight();
knight.displayStats();
knight.attackAbility();
knight.defenseAbility();
knight.specialAbility();

System.out.println("Ranger");
Ranger ranger = new Ranger();
ranger.displayStats();
ranger.attackAbility();
ranger.movementAbility();
ranger.specialAbility();

System.out.println("Paladin");
Paladin paladin = new Paladin();
paladin.displayStats();
paladin.attackAbility();
paladin.defenseAbility();
paladin.movementAbility();
paladin.ultimateAbility();
}
}

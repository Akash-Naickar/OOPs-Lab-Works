public class Character {
public void displayBasicInfo() {
System.out.println("Character Base Properties");
}
}

public class Starlord extends Character {
public void displayAbilities() {
System.out.println("Q: Galactic Legend");
System.out.println("Shift: Rocket Propulsion");
System.out.println("E: Blaster Barrage");
}
}

public class IronMan extends Character {
public void displayAbilities() {
System.out.println("Q: Unibeam");
System.out.println("Shift: Flight");
System.out.println("E: Repulsor Blast");
}
}

public class Hulk extends Character {
public void displayAbilities() {
System.out.println("Q: Thunderclap");
System.out.println("Shift: Leap");
System.out.println("E: Ground Smash");
}
}

public class CharacterMain {
public static void main(String[] args) {
System.out.println("Starlord");
Starlord sl = new Starlord();
sl.displayBasicInfo();
sl.displayAbilities();

System.out.println("Iron Man");
IronMan im = new IronMan();
im.displayBasicInfo();
im.displayAbilities();

System.out.println("Hulk");
Hulk hk = new Hulk();
hk.displayBasicInfo();
hk.displayAbilities();
}
}

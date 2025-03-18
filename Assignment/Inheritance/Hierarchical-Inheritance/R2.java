public class Weapon {
public void displayWeaponInfo() {
System.out.println("Basic Weapon Properties");
}
}

public class AssaultRifle extends Weapon {
public void use() {
System.out.println("Click Left-mouse for Assault Rifle Action");
System.out.println("Press R to Reload");
}
}

public class Shotgun extends Weapon {
public void use() {
System.out.println("Click Left-mouse for Shot Gun Action");
System.out.println("Press R to Reload Shells");
}
}

public class Sniper extends Weapon {
public void use() {
System.out.println("Click Left-mouse for Sniper Shot");
System.out.println("Press Right-mouse to Scope");
}
}

public class WeaponMain {
public static void main(String[] args) {
System.out.println("Assault Rifle");
AssaultRifle ar = new AssaultRifle();
ar.displayWeaponInfo();
ar.use();

System.out.println("Shotgun");
Shotgun sg = new Shotgun();
sg.displayWeaponInfo();
sg.use();

System.out.println("Sniper");
Sniper sr = new Sniper();
sr.displayWeaponInfo();
sr.use();
}
}


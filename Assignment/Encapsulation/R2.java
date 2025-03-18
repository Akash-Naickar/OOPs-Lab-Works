class Adjudication {
private String weaponName = "Assault Rifle";
private int damage = 25;
public void AR() {
System.out.println("Click Left-mouse for " + weaponName + " Action");
}
public String getWeaponName() {
return weaponName;
}
public void setWeaponName(String weaponName) {
this.weaponName = weaponName;
}
public int getDamage() {
return damage;
}
public void setDamage(int damage) {
this.damage = damage;
}
}
class Deliverance extends Adjudication{
private String secondaryWeapon = "Shot Gun";
private int secondaryDamage = 75;
public void SG(){
System.out.println("Click Left-mouse for " + secondaryWeapon + " Action");
}
public String getSecondaryWeapon() {
return secondaryWeapon;
}
public void setSecondaryWeapon(String secondaryWeapon) {
this.secondaryWeapon = secondaryWeapon;
}
public int getSecondaryDamage() {
return secondaryDamage;
}
public void setSecondaryDamage(int secondaryDamage) {
this.secondaryDamage = secondaryDamage;
}
}
class Spl1 extends Deliverance{
private String ability1 = "Vantage Connection";
private int cooldown1 = 30;
public void SpecAb1(){
System.out.println("Press Shift for " + ability1);
}
public String getAbility1() {
return ability1;
}
public void setAbility1(String ability1) {
this.ability1 = ability1;
}
public int getCooldown1() {
return cooldown1;
}
public void setCooldown1(int cooldown1) {
this.cooldown1 = cooldown1;
}
}
class Spl2 extends Spl1{
private String ability2 = "Culling Turret";
private int cooldown2 = 60;
public void SpecAb2(){
System.out.println("Press E for " + ability2);
}
public String getAbility2() {
return ability2;
}
public void setAbility2(String ability2) {
this.ability2 = ability2;
}
public int getCooldown2() {
return cooldown2;
}
public void setCooldown2(int cooldown2) {
this.cooldown2 = cooldown2;
}
}
public class Main{
public static void main(String[] args){
Spl2 mine = new Spl2();
mine.AR();
mine.SG();
mine.SpecAb1();
mine.SpecAb2();
System.out.println("Primary Weapon Damage: " + mine.getDamage());
System.out.println("Secondary Weapon Damage: " + mine.getSecondaryDamage());
mine.setWeaponName("Enhanced Assault Rifle");
mine.setSecondaryWeapon("Heavy Shotgun");
mine.setAbility1("Enhanced Vantage");
mine.setCooldown1(20);
mine.AR();
mine.SG();
mine.SpecAb1();
System.out.println("Ability 1 Cooldown: " + mine.getCooldown1() + "s");
}
}

class Adjudication {
public void AR() {
System.out.println("Click Left-mouse for Assault Rifle Action");
}
public void AR(String weaponType) {
System.out.println("Click Left-mouse for " + weaponType + " Assault Rifle Action");
}
public void AR(int level, String weaponType) {
System.out.println("Click Left-mouse for Level " + level + " " + weaponType + " Assault Rifle Action");
}
}
class Deliverance extends Adjudication{
public void SG(){
System.out.println("Click Left-mouse for Shot Gun Action");
}
public void SG(int ammo){
System.out.println("Click Left-mouse for Shot Gun Action with " + ammo + " shells");
}
}
class Spl1 extends Deliverance{
public void SpecAb1(){
System.out.println("Press Shift for Vantage Connection");
}
public void SpecAb1(int duration){
System.out.println("Press Shift for Vantage Connection lasting " + duration + " seconds");
}
}
class Spl2 extends Spl1{
public void SpecAb2(){
System.out.println("Press E for Culling Turret");
}
public void SpecAb2(int damage){
System.out.println("Press E for Culling Turret with " + damage + " damage");
}
public void SpecAb2(int damage, int duration){
System.out.println("Press E for Culling Turret with " + damage + " damage lasting " + duration + " seconds");
}
}
public class Main{
public static void main(String[] args){
Spl2 mine = new Spl2();
mine.AR();
mine.AR("Tactical");
mine.AR(3, "Legendary");
mine.SG();
mine.SG(6);
mine.SpecAb1();
mine.SpecAb1(30);
mine.SpecAb2();
mine.SpecAb2(500);
mine.SpecAb2(500, 45);
}
}

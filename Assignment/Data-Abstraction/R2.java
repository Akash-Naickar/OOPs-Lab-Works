abstract class Adjudication {
public abstract void AR();
public void showWeaponInfo() {
System.out.println("Primary Weapon: Assault Rifle");
}
}
class Deliverance extends Adjudication{
public void AR() {
System.out.println("Click Left-mouse for Assault Rifle Action");
}
public void SG(){
System.out.println("Click Left-mouse for Shot Gun Action");
}
}
abstract class SpecialAbility extends Deliverance {
public abstract void useSpecial();
}
class Spl1 extends SpecialAbility{
public void useSpecial() {
System.out.println("Using special ability");
}
public void SpecAb1(){
System.out.println("Press Shift for Vantage Connection");
}
}
class Spl2 extends Spl1{
public void SpecAb2(){
System.out.println("Press E for Culling Turret");
}
}
public class Main{
public static void main(String[] args){
Spl2 mine = new Spl2();
mine.AR();
mine.SG();
mine.SpecAb1();
mine.SpecAb2();
mine.showWeaponInfo();
mine.useSpecial();
}
}

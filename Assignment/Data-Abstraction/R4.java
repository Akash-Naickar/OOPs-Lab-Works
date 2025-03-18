abstract class Primary{
public abstract void SP();
public void showHeroType() {
System.out.println("Hero Type: Spider");
}
}
class Secondary extends Primary{
public void SP() {
System.out.println("Click Left-mouse for Spider-Power");
}
public void WC(){
System.out.println("Click Right-mouse for Web Cluster");
}
}
interface SpecialMove {
void performSpecialMove();
}
class E extends Secondary implements SpecialMove{
public void GOH(){
System.out.println("Press E for Get Over Here");
}
public void performSpecialMove() {
System.out.println("Performing spider special move");
}
}
abstract class UltimateAbility {
public abstract void activateUltimate();
}
class Ult extends E{
public void Q() {
System.out.println("Click Q to enable Spectacular Spin");
}
public void activateUltimate() {
System.out.println("Activating ultimate spider ability");
}
}
public class Main{
public static void main(String[] args){
Ult mine = new Ult();
mine.SP();
mine.WC();
mine.GOH();
mine.Q();
mine.showHeroType();
mine.performSpecialMove();
}
}

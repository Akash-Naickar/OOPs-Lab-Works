class galacticLegend{
public void Q() {
System.out.println("Click Q to enable Galactic Legend");
}
public void Q(int powerLevel) {
System.out.println("Click Q to enable Galactic Legend at power level " + powerLevel);
}
}
class rocketPropulsion extends galacticLegend{
public void RP(){
System.out.println("Press Shift for Rocket Propulsion");
}
public void RP(int speed){
System.out.println("Press Shift for Rocket Propulsion at speed " + speed);
}
public void RP(String direction, int speed){
System.out.println("Press Shift for Rocket Propulsion " + direction + " at speed " + speed);
}
}
class blasterBarrage extends rocketPropulsion{
public void BR(){
System.out.println("Press E for Blaster Barrage");
}
public void BR(int shots){
System.out.println("Press E for Blaster Barrage with " + shots + " shots");
}
}
class Stat extends blasterBarrage{
public void N(){
System.out.println("Name: Starlord");
}
public void N(String title){
System.out.println("Name: " + title + " Starlord");
}
public void N(String prefix, String suffix){
System.out.println("Name: " + prefix + " Starlord " + suffix);
}
}
public class Main{
public static void main(String[] args){
Stat mine = new Stat();
mine.Q();
mine.Q(9000);
mine.RP();
mine.RP(300);
mine.RP("upward", 450);
mine.BR();
mine.BR(100);
mine.N();
mine.N("Legendary");
mine.N("Cosmic", "the Destroyer");
}
}

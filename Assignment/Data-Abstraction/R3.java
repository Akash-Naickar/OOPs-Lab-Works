abstract class galacticLegend{
public abstract void Q();
public void showLegendInfo() {
System.out.println("Galactic Legend: Ultimate Space Power");
}
}
class rocketPropulsion extends galacticLegend{
public void Q() {
System.out.println("Click Q to enable Galactic Legend");
}
public void RP(){
System.out.println("Press Shift for Rocket Propulsion");
}
}
abstract class PowerUser extends rocketPropulsion {
public abstract void showPowerStatus();
}
class blasterBarrage extends PowerUser{
public void showPowerStatus() {
System.out.println("Power Status: Galactic");
}
public void BR(){
System.out.println("Press E for Blaster Barrage");
}
}
class Stat extends blasterBarrage{
public void N(){
System.out.println("Name: Starlord");
}
}
public class Main{
public static void main(String[] args){
Stat mine = new Stat();
mine.Q();
mine.RP();
mine.BR();
mine.N();
mine.showLegendInfo();
mine.showPowerStatus();
}
}

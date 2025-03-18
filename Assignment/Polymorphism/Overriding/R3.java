class galacticLegend{
public void Q() {
System.out.println("Click Q to enable Galactic Legend");
}
}
class rocketPropulsion extends galacticLegend{
@Override
public void Q() {
System.out.println("Click Q to enable Enhanced Galactic Legend");
}
public void RP(){
System.out.println("Press Shift for Rocket Propulsion");
}
}
class blasterBarrage extends rocketPropulsion{
@Override
public void Q() {
System.out.println("Click Q to enable Supreme Galactic Legend");
}
@Override
public void RP(){
System.out.println("Press Shift for Enhanced Rocket Propulsion");
}
public void BR(){
System.out.println("Press E for Blaster Barrage");
}
}
class Stat extends blasterBarrage{
@Override
public void Q() {
System.out.println("Click Q to enable Ultimate Galactic Legend");
}
@Override
public void RP(){
System.out.println("Press Shift for Supreme Rocket Propulsion");
}
@Override
public void BR(){
System.out.println("Press E for Enhanced Blaster Barrage");
}
public void N(){
System.out.println("Name: Starlord");
}
}
public class Main{
public static void main(String[] args){
galacticLegend base = new galacticLegend();
rocketPropulsion level1 = new rocketPropulsion();
blasterBarrage level2 = new blasterBarrage();
Stat level3 = new Stat();
base.Q();
level1.Q();
level1.RP();
level2.Q();
level2.RP();
level2.BR();
level3.Q();
level3.RP();
level3.BR();
level3.N();
}
}

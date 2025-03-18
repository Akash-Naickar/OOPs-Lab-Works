class galacticLegend{
private String legendName = "Galactic Legend";
private int energyCost = 100;
public void Q() {
System.out.println("Click Q to enable " + legendName);
}
public String getLegendName() {
return legendName;
}
public void setLegendName(String legendName) {
this.legendName = legendName;
}
public int getEnergyCost() {
return energyCost;
}
public void setEnergyCost(int energyCost) {
this.energyCost = energyCost;
}
}
class rocketPropulsion extends galacticLegend{
private int propulsionPower = 500;
private int fuelConsumption = 25;
public void RP(){
System.out.println("Press Shift for Rocket Propulsion with power " + propulsionPower);
}
public int getPropulsionPower() {
return propulsionPower;
}
public void setPropulsionPower(int propulsionPower) {
this.propulsionPower = propulsionPower;
}
public int getFuelConsumption() {
return fuelConsumption;
}
public void setFuelConsumption(int fuelConsumption) {
this.fuelConsumption = fuelConsumption;
}
}
class blasterBarrage extends rocketPropulsion{
private int blasterCount = 10;
private int damagePerBlast = 45;
public void BR(){
System.out.println("Press E for Blaster Barrage with " + blasterCount + " blasters");
}
public int getBlasterCount() {
return blasterCount;
}
public void setBlasterCount(int blasterCount) {
this.blasterCount = blasterCount;
}
public int getDamagePerBlast() {
return damagePerBlast;
}
public void setDamagePerBlast(int damagePerBlast) {
this.damagePerBlast = damagePerBlast;
}
}
class Stat extends blasterBarrage{
private String heroName = "Starlord";
private int level = 5;
public void N(){
System.out.println("Name: " + heroName + " (Level " + level + ")");
}
public String getHeroName() {
return heroName;
}
public void setHeroName(String heroName) {
this.heroName = heroName;
}
public int getLevel() {
return level;
}
public void setLevel(int level) {
this.level = level;
}
}
public class Main{
public static void main(String[] args){
Stat mine = new Stat();
mine.Q();
mine.RP();
mine.BR();
mine.N();
System.out.println("Propulsion Fuel Cost: " + mine.getFuelConsumption());
System.out.println("Total Blaster Damage: " + (mine.getBlasterCount() * mine.getDamagePerBlast()));
mine.setLegendName("Supreme Galactic Legend");
mine.setPropulsionPower(750);
mine.setBlasterCount(15);
mine.setLevel(10);
mine.Q();
mine.RP();
mine.BR();
mine.N();
System.out.println("New Total Blaster Damage: " + (mine.getBlasterCount() * mine.getDamagePerBlast()));
}
}

class Ult {
private String ultName = "Final Judgement";
private int ultPower = 1000;
public void displayUlt() {
System.out.println("Ult: " + ultName);
}
public String getUltName() {
return ultName;
}
public void setUltName(String ultName) {
this.ultName = ultName;
}
public int getUltPower() {
return ultPower;
}
public void setUltPower(int ultPower) {
this.ultPower = ultPower;
}
}
class Passive extends Ult{
private String passiveName = "Regeneration";
private int healAmount = 50;
public void displayPassive(){
System.out.println("Passive: " + passiveName);
}
public String getPassiveName() {
return passiveName;
}
public void setPassiveName(String passiveName) {
this.passiveName = passiveName;
}
public int getHealAmount() {
return healAmount;
}
public void setHealAmount(int healAmount) {
this.healAmount = healAmount;
}
}
class heroStat extends Passive{
private String heroName = "The Punisher";
private int level = 1;
public void displayName(){
System.out.println("Name: " + heroName);
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
heroStat mine = new heroStat();
mine.displayUlt();
mine.displayPassive();
mine.displayName();
System.out.println("Hero Power: " + mine.getUltPower());
mine.setUltName("Divine Retribution");
mine.setPassiveName("Enhanced Recovery");
mine.setLevel(10);
mine.displayUlt();
mine.displayPassive();
mine.displayName();
System.out.println("Hero Level: " + mine.getLevel());
}
}

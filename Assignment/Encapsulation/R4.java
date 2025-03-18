class Primary{
private int spiderStrength = 100;
private String attackName = "Spider-Power";
public void SP(){
System.out.println("Click Left-mouse for " + attackName + " (Strength: " + spiderStrength + ")");
}
public int getSpiderStrength() {
return spiderStrength;
}
public void setSpiderStrength(int spiderStrength) {
this.spiderStrength = spiderStrength;
}
public String getAttackName() {
return attackName;
}
public void setAttackName(String attackName) {
this.attackName = attackName;
}
}
class Secondary extends Primary{
private int webCount = 8;
private String webType = "Standard";
public void WC(){
System.out.println("Click Right-mouse for Web Cluster with " + webCount + " " + webType + " webs");
}
public int getWebCount() {
return webCount;
}
public void setWebCount(int webCount) {
this.webCount = webCount;
}
public String getWebType() {
return webType;
}
public void setWebType(String webType) {
this.webType = webType;
}
}
class E extends Secondary{
private int pullRange = 30;
private int pullSpeed = 2;
public void GOH(){
System.out.println("Press E for Get Over Here with range " + pullRange);
}
public int getPullRange() {
return pullRange;
}
public void setPullRange(int pullRange) {
this.pullRange = pullRange;
}
public int getPullSpeed() {
return pullSpeed;
}
public void setPullSpeed(int pullSpeed) {
this.pullSpeed = pullSpeed;
}
}
class Ult extends E{
private int ultDuration = 10;
private int ultDamage = 500;
public void Q() {
System.out.println("Click Q to enable Spectacular Spin for " + ultDuration + " seconds with " + ultDamage + " damage");
}
public int getUltDuration() {
return ultDuration;
}
public void setUltDuration(int ultDuration) {
this.ultDuration = ultDuration;
}
public int getUltDamage() {
return ultDamage;
}
public void setUltDamage(int ultDamage) {
this.ultDamage = ultDamage;
}
}
public class Main{
public static void main(String[] args){
Ult mine = new Ult();
mine.SP();
mine.WC();
mine.GOH();
mine.Q();
System.out.println("Web Details: " + mine.getWebCount() + " " + mine.getWebType() + " webs");
System.out.println("Pull Effectiveness: Range " + mine.getPullRange() + ", Speed " + mine.getPullSpeed());
mine.setSpiderStrength(200);
mine.setWebType("Electrified");
mine.setWebCount(12);
mine.setPullRange(45);
mine.setUltDuration(15);
mine.setUltDamage(750);
mine.SP();
mine.WC();
mine.GOH();
mine.Q();
System.out.println("New Web Details: " + mine.getWebCount() + " " + mine.getWebType() + " webs");
System.out.println("Ultimate Power: " + (mine.getUltDuration() * mine.getUltDamage()));
}
}

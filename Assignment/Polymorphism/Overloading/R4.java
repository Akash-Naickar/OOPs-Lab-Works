class Primary{
public void SP(){
System.out.println("Click Left-mouse for Spider-Power");
}
public void SP(int strength){
System.out.println("Click Left-mouse for Spider-Power with strength " + strength);
}
}
class Secondary extends Primary{
public void WC(){
System.out.println("Click Right-mouse for Web Cluster");
}
public void WC(int webCount){
System.out.println("Click Right-mouse for Web Cluster with " + webCount + " webs");
}
public void WC(int webCount, String webType){
System.out.println("Click Right-mouse for Web Cluster with " + webCount + " " + webType + " webs");
}
}
class E extends Secondary{
public void GOH(){
System.out.println("Press E for Get Over Here");
}
public void GOH(int range){
System.out.println("Press E for Get Over Here with range " + range);
}
}
class Ult extends E{
public void Q() {
System.out.println("Click Q to enable Spectacular Spin");
}
public void Q(int duration) {
System.out.println("Click Q to enable Spectacular Spin for " + duration + " seconds");
}
public void Q(int duration, int damage) {
System.out.println("Click Q to enable Spectacular Spin for " + duration + " seconds with " + damage + " damage");
}
}
public class Main{
public static void main(String[] args){
Ult mine = new Ult();
mine.SP();
mine.SP(500);
mine.WC();
mine.WC(8);
mine.WC(5, "sticky");
mine.GOH();
mine.GOH(25);
mine.Q();
mine.Q(15);
mine.Q(10, 750);
}
}

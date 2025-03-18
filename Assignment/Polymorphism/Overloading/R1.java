class Ult {
public void displayUlt() {
System.out.println("Ult: Final Judgement");
}
public void displayUlt(String modifier) {
System.out.println("Ult: Final Judgement with " + modifier);
}
public void displayUlt(int level) {
System.out.println("Level " + level + " Ult: Final Judgement");
}
}
class Passive extends Ult{
public void displayPassive(){
System.out.println("Passive: Regeneration");
}
public void displayPassive(int level){
System.out.println("Level " + level + " Passive: Regeneration");
}
}
class heroStat extends Passive{
public void displayName(){
System.out.println("Name: The Punisher");
}
public void displayName(String title){
System.out.println("Name: " + title + " The Punisher");
}
}
public class Main{
public static void main(String[] args){
heroStat mine = new heroStat();
mine.displayUlt();
mine.displayUlt("Divine Power");
mine.displayUlt(3);
mine.displayPassive();
mine.displayPassive(2);
mine.displayName();
mine.displayName("Lord");
}
}

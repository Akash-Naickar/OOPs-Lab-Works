abstract class Ult {
public abstract void displayUlt();
public void showUltType() {
System.out.println("Ultimate Ability");
}
}
class Passive extends Ult{
public void displayUlt() {
System.out.println("Ult: Final Judgement");
}
public void displayPassive(){
System.out.println("Passive: Regeneration");
}
}
class heroStat extends Passive{
public void displayName(){
System.out.println("Name: The Punisher");
}
}
public class Main{
public static void main(String[] args){
heroStat mine = new heroStat();
mine.displayUlt();
mine.displayPassive();
mine.displayName();
mine.showUltType();
}
}

class Ult {
public void displayUlt() {
System.out.println("Ult: Final Judgement");
}
}
class Passive extends Ult{
@Override
public void displayUlt() {
System.out.println("Ult: Heavenly Wrath");
}
public void displayPassive(){
System.out.println("Passive: Regeneration");
}
}
class heroStat extends Passive{
@Override
public void displayUlt() {
System.out.println("Ult: Divine Retribution");
}
@Override
public void displayPassive(){
System.out.println("Passive: Enhanced Recovery");
}
public void displayName(){
System.out.println("Name: The Punisher");
}
}
public class Main{
public static void main(String[] args){
Ult baseHero = new Ult();
Passive midHero = new Passive();
heroStat fullHero = new heroStat();
baseHero.displayUlt();
midHero.displayUlt();
midHero.displayPassive();
fullHero.displayUlt();
fullHero.displayPassive();
fullHero.displayName();
}
}

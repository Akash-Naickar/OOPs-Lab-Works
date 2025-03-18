
public class Ult {
public void displayUlt() {
System.out.println("Ult: Final Judgement");
}
}

public class Passive extends Ult{
public void displayPassive(){
System.out.println("Passive: Regeneration");
}
}

public class heroStat extends Passive{
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
}
}

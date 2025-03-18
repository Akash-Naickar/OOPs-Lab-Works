public class Hulk {
public void Passive() {
System.out.println("Passive: Regeneration");
}
}

public class Wolverine extends Hulk{
public void Ult(){
System.out.println("Ult: Last Stand");
}
}

public class Main{
public static void main(String[] args){
Wolverine mine = new Wolverine();
mine.Ult();
mine.Passive();
}
}

public class Stand1 {
public void Ult() {
System.out.println("Ult: Final Judgement");
}
}

public class Stand2 extends Stand1{
public void Passive(){
System.out.println("Passive: Regeneration");
}
}

public class Main{
public static void main(String[] args){
Stand2 mine = new Stand2();
mine.Ult();
mine.Passive();
}
}

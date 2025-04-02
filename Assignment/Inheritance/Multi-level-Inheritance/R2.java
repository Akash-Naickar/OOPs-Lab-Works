class Adjudication {
public void AR() {
System.out.println("Click Left-mouse for Assault Rifle Action");
}
}

class Deliverance extends Adjudication{
public void SG(){
System.out.println("Click Left-mouse for Shot Gun Action");
}
}

class Spl1 extends Deliverance{
public void SpecAb1(){
System.out.println("Press Shift for Vantage Connection");
}
}

class Spl2 extends Spl1{
public void SpecAb2(){
System.out.println("Press E for Culling Turret");
}
}

public class Main{
public static void main(String[] args){
Spl2 mine = new Spl2();
mine.AR();
mine.SG();
mine.SpecAb1();
mine.SpecAb2();  
}
}

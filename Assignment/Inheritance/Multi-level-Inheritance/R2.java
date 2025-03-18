public class Adjudication {
public void AR() {
System.out.println("Assault Rifle Action");
}
}

public class Deliverance extends Adjudication{
public void SG(){
System.out.println("Shot Gun Action");
}
}

public class Spl1 extends Deliverance{
public void SpecAb1(){
System.out.println("Vantage Connection");
}
}

public class Spl2 extends Spl1{
public void SpecAb2(){
System.out.println("Culling Turret");
}
}

public class Main{
public static void main(String[] args){
Spl2 mine = new Spl2();
mine.Adjudication();
mine.Deliverance();
mine.SpecAb1();
mine.SpecAb2();  
}
}

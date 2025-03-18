public class Primary{
public void SP(){
System.out.println("Click Left-mouse for Spider-Power");
}
}

public class Secondary extends Primary{
public void WC(){
System.out.println("Click Right-mouse for Web Cluster");
}
}

public class E extends Secondary{
public void GOH(){
System.out.println("Press E for Get Over Here");
}
}


public class Ult extends E{
public void Q() {
System.out.println("Click Q to enable Spectacular Spin");
}
}

public class Main{
public static void main(String[] args){
Ult mine = new Ult();
mine.SP();
mine.WC();
mine.GOH();
mine.Q();
}
}

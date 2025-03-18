public class galacticLegend{
public void Q() {
System.out.println("Click Q to enable Galactic Legend");
}
}

public class rocketPropulsion extends galacticLegend{
public void RP(){
System.out.println("Press Shift for Rocket Propulsion");
}
}

public class blasterBarrage extends rocketPropulsion{
public void BR(){
System.out.println("Press E for Blaster Barrage");
}
}

public class stellarShift extends blasterBarrage{
public void SS(){
System.out.println("Hold Shift for Stellar Shift");
}
}

public class Stat extends blasterBarrage{
public void N(){
System.out.println("Name: Starlord");
}
}

public class Main{
public static void main(String[] args){
Stat mine = new Stat();
mine.Q();
mine.RP();
mine.BR();
mine.SS();
mine.N();
}
}

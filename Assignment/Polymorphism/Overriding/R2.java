class Adjudication {
public void AR() {
System.out.println("Click Left-mouse for Assault Rifle Action");
}
}
class Deliverance extends Adjudication{
@Override
public void AR() {
System.out.println("Click Left-mouse for Enhanced Rifle Action");
}
public void SG(){
System.out.println("Click Left-mouse for Shot Gun Action");
}
}
class Spl1 extends Deliverance{
@Override
public void AR() {
System.out.println("Click Left-mouse for Precision Rifle Action");
}
@Override
public void SG(){
System.out.println("Click Left-mouse for Improved Shot Gun Action");
}
public void SpecAb1(){
System.out.println("Press Shift for Vantage Connection");
}
}
class Spl2 extends Spl1{
@Override
public void AR() {
System.out.println("Click Left-mouse for Ultimate Rifle Action");
}
@Override
public void SG(){
System.out.println("Click Left-mouse for Ultimate Shot Gun Action");
}
@Override
public void SpecAb1(){
System.out.println("Press Shift for Enhanced Vantage Connection");
}
public void SpecAb2(){
System.out.println("Press E for Culling Turret");
}
}
public class Main{
public static void main(String[] args){
Adjudication base = new Adjudication();
Deliverance level1 = new Deliverance();
Spl1 level2 = new Spl1();
Spl2 level3 = new Spl2();
base.AR();
level1.AR();
level1.SG();
level2.AR();
level2.SG();
level2.SpecAb1();
level3.AR();
level3.SG();
level3.SpecAb1();
level3.SpecAb2();
}
}

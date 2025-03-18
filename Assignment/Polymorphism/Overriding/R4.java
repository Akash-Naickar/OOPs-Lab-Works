class Primary{
public void SP(){
System.out.println("Click Left-mouse for Spider-Power");
}
}
class Secondary extends Primary{
@Override
public void SP(){
System.out.println("Click Left-mouse for Enhanced Spider-Power");
}
public void WC(){
System.out.println("Click Right-mouse for Web Cluster");
}
}
class E extends Secondary{
@Override
public void SP(){
System.out.println("Click Left-mouse for Superior Spider-Power");
}
@Override
public void WC(){
System.out.println("Click Right-mouse for Improved Web Cluster");
}
public void GOH(){
System.out.println("Press E for Get Over Here");
}
}
class Ult extends E{
@Override
public void SP(){
System.out.println("Click Left-mouse for Ultimate Spider-Power");
}
@Override
public void WC(){
System.out.println("Click Right-mouse for Ultimate Web Cluster");
}
@Override
public void GOH(){
System.out.println("Press E for Enhanced Get Over Here");
}
public void Q() {
System.out.println("Click Q to enable Spectacular Spin");
}
}
public class Main{
public static void main(String[] args){
Primary base = new Primary();
Secondary level1 = new Secondary();
E level2 = new E();
Ult level3 = new Ult();
base.SP();
level1.SP();
level1.WC();
level2.SP();
level2.WC();
level2.GOH();
level3.SP();
level3.WC();
level3.GOH();
level3.Q();
}
}

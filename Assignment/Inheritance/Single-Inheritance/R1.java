public class Animal {
public void eat() {
System.out.println("Animal is eating");
}
}

public class Lion extends Animal{
public void roar(){
System.out.println("Lion roaring");
}
}

public class Main{
public static void main(String[] args){
Lion mine = new Lion();
mine.eat();
mine.roar();
}
}

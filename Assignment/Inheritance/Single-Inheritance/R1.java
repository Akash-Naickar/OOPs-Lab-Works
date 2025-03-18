public class Animal {
public void eat() {
System.out.println("Animal is eating");
}
}

public class Lion extends Animal{
public void bark(){
System.out.println("Dog barking");
}
}

public class Main{
public static void main(String[] args){
Dog mine = new Dog();
mine.eat();
mine.bark();
}
}

package mypack1;

public class Main {
    public void sayHello() {
        System.out.println("Hello from mypack1!");
    }
}

import mypack1.Main;

public class Test1 {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.sayHello();
    }
}

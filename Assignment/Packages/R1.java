package mypack2;

public class Main {
    double length, width;

    public Main(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }
}

import mypack2.Main;

public class Test2 {
    public static void main(String[] args) {
        Main r = new Main(5, 3.5);
        System.out.println("Area: " + r.area());
    }
}


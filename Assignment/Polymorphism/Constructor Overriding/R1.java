class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }

    Animal(String type) {
        System.out.println("Animal type: " + type);
    }
}

class Main extends Animal {
    Main() {
        super();
        System.out.println("Dog constructor called");
    }

    Main(String breed) {
        super("Mammal");
        System.out.println("Dog breed: " + breed);
    }

    public static void main(String[] args) {
        Main d1 = new Main();
        Main d2 = new Main("Labrador");
    }
}

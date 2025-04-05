class Main {
    String name;
    int age;

    Main() {
        name = "Unknown";
        age = 0;
    }

    Main(String n) {
        name = n;
        age = 0;
    }

    Main(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Main s1 = new Main();
        Main s2 = new Main("Alice");
        Main s3 = new Main("Bob", 21);

        s1.display();
        s2.display();
        s3.display();
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

interface Work {
    void doWork();
}

class Employee extends Person implements Work {
    double salary;
    String jobTitle;

    public Employee(String name, int age, double salary, String jobTitle) {
        super(name, age);
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void doWork() {
        System.out.println(jobTitle + " is working.");
    }

    void showEmployeeDetails() {
        displayInfo();
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, int age, double salary, String jobTitle, int teamSize) {
        super(name, age, salary, jobTitle);
        this.teamSize = teamSize;
    }

    void manageTeam() {
        System.out.println(jobTitle + " is managing a team of " + teamSize + " people.");
    }
}

class Intern extends Employee {
    int duration; // Internship duration in months

    public Intern(String name, int age, double salary, String jobTitle, int duration) {
        super(name, age, salary, jobTitle);
        this.duration = duration;
    }

    void showInternshipDetails() {
        System.out.println(jobTitle + " internship is for " + duration + " months.");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("A", 35, 85000, "Project Manager", 10);
        Intern intern = new Intern("B", 22, 1500, "Software Intern", 6);

        System.out.println("\nManager Details:");
        manager.showEmployeeDetails();
        manager.doWork();
        manager.manageTeam();

        System.out.println("\nIntern Details:");
        intern.showEmployeeDetails();
        intern.doWork();
        intern.showInternshipDetails();
    }
}

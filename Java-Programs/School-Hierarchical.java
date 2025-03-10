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

class Student extends Person {
    String studentID;
    String grade;

    public Student(String name, int age, String studentID, String grade) {
        super(name, age);
        this.studentID = studentID;
        this.grade = grade;
    }

    void showStudentInfo() {
        displayInfo();
        System.out.println("Student ID: " + studentID);
        System.out.println("Grade: " + grade);
    }
}

class Teacher extends Person {
    String teacherID;
    String subject;

    public Teacher(String name, int age, String teacherID, String subject) {
        super(name, age);
        this.teacherID = teacherID;
        this.subject = subject;
    }

    void showTeacherInfo() {
        displayInfo();
        System.out.println("Teacher ID: " + teacherID);
        System.out.println("Subject: " + subject);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("A", 17, "12345", "10th Grade");
        Teacher teacher = new Teacher("Mr. B", 40, "98765", "Mathematics");

        System.out.println("\nStudent Details:");
        student.showStudentInfo();

        System.out.println("\nTeacher Details:");
        teacher.showTeacherInfo();
    }
}


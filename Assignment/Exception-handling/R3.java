public class Main {
    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

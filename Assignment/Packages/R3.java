import java.util.Scanner;
import java.util.Random;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        LocalDate date = LocalDate.now();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        int luckyNumber = rand.nextInt(100) + 1;

        System.out.println("Hello, " + name + "!");
        System.out.println("Today's date is: " + date);
        System.out.println("Your lucky number is: " + luckyNumber);
    }
}

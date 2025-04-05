import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output1.txt", true);
            writer.write("\nThis line is appended.");
            writer.close();
            System.out.println("Append successful.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}


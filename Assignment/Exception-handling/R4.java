import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void readData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a line: ");
        String line = br.readLine();
        System.out.println("You entered: " + line);
    }

    public static void main(String[] args) {
        try {
            readData();
        } catch (IOException e) {
            System.out.println("IOException occurred");
        } finally {
            System.out.println("Program ended");
        }
    }
}

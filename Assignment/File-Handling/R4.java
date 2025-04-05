import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("output1.txt");
        if (file.delete()) {
            System.out.println("Deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}

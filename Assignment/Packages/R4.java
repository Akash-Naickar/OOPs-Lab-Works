import java.util.Arrays;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 4, 1};
        Arrays.sort(numbers);

        double root = Math.sqrt(numbers[numbers.length - 1]);

        Formatter fmt = new Formatter();
        fmt.format("Sorted numbers: %s\n", Arrays.toString(numbers));
        fmt.format("Square root of largest number: %.2f", root);

        System.out.println(fmt);
        fmt.close();
    }
}

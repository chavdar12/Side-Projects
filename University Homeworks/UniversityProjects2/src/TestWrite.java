import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestWrite {
    public static void main(String[] args) {
        int[][] sudokuNumbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        try (
                PrintStream output = new PrintStream("output.txt");) {
            for (int[] sudokuNumber : sudokuNumbers) {
                StringBuilder s = new StringBuilder();
                for (int i : sudokuNumber) {
                    s.append(i).append(", ");
                }
                output.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

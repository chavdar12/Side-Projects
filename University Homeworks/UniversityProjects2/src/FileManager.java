import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileManager {
    private String fileName;
    private String filePath;

    public FileManager(String filePath, String fileName) {
        this.fileName = fileName;
        this.filePath = filePath;
    }

    public FileManager() {
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    //method to check if file exists
    public boolean fileExists() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath + fileName));
            br.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //method to read file
    public String readFile() throws FileNotFoundException {
        Scanner input = new Scanner(new File("src/array.txt"));

        Table table = new Table();

// pre-read in the number of rows/columns
        int rows = 0;
        int columns = 0;
        while (input.hasNextLine()) {
            ++rows;
            Scanner colReader = new Scanner(input.nextLine());
            while (colReader.hasNextInt()) {
                ++columns;
            }
        }
        table.setRow(rows);
        table.setCol(columns);

        input.close();

// read in the data
        input = new Scanner(new File("src/array.txt"));
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                if (input.hasNext()) {
                    table[i][j] = input.next();
                }
            }
        }
    }
}

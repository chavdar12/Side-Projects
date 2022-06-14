import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.exit;

public class Menu {

    public static void main(String[] args) {
        var reader = new BufferedReader(new InputStreamReader(System.in));

        var arr = new String[][]{{"a", "b", "c"}, {"a1", "b1", "c1"}, {"a2", "b2", "c2"}};

        Table table = new Table();

        while (true) {
            try {
                var commands = reader.readLine().split("\\s+");
                switch (commands[0]) {
                    case "open":
                        try {
                            System.out.println("Enter file name:");
                            var fileName = reader.readLine();
                            System.out.println("Opening file " + fileName);
                            var context = JAXBContext.newInstance(Table.class);
                            var unmarshaller = context.createUnmarshaller();
                            table = (Table) unmarshaller.unmarshal(new File(fileName));
                            System.out.println("Successfully opened file " + fileName);
                        } catch (Exception e) {
                            System.out.println("File doesn't exist");
                            System.out.println("Creating new file");
                            JAXB.marshal(table, new File("table.xml"));
                            var context = JAXBContext.newInstance(Table.class);
                            var unmarshaller = context.createUnmarshaller();
                            table = (Table) unmarshaller.unmarshal(new File("table.xml"));
                            System.out.println("Successfully created new file");
                        }
                        break;
                    case "close":
                        var context = JAXBContext.newInstance(Table.class);
                        var unmarshaller = context.createUnmarshaller();
                        table = (Table) unmarshaller.unmarshal(new File("table.xml"));
                        break;
                    case "save":
                        JAXB.marshal(table, new File("table.xml"));
                        break;
                    case "save as":
                        try {
                            System.out.println("Enter file name to save as:");
                            String fileName = reader.readLine();
                            JAXB.marshal(table, new File(fileName + ".xml"));
                            System.out.println("File saved");
                        } catch (Exception e) {
                            System.out.println("Invalid file name");
                        }
                        break;
                    case "help":
                        printHelp();
                        break;
                    case "exit":
                        exit(0);
                        break;
                    case "print":
                        table.print();
                        break;
                    case "edit":
                        System.out.println("Enter the row and column of the cell you want to edit:");
                        String input = reader.readLine().split("\\s+")[0];
                        Pattern pattern = Pattern.compile("\\d+");
                        Matcher matcher = pattern.matcher(input);
                        int row = 0;
                        int cow = 0;
                        while (matcher.find()) {
                            row = Integer.parseInt(matcher.group());
                            cow = Integer.parseInt(matcher.group());
                        }
                        if (table.isInBounds(row - 1, cow - 1)) {
                            System.out.println("Previous value: " + table.getValue(row - 1, cow - 1));
                            System.out.println("Enter the new value:");
                            table.setValue(row, cow, reader.readLine());
                            System.out.println("New value: " + table.getValue(row - 1, cow - 1));
                        } else {
                            System.out.println("The cell is out of bounds!");
                        }
                        break;

                }
            } catch (Exception ex) {
                System.out.println("Enter a valid command!");
            }
        }
    }

    private static void printHelp() {
        System.out.println("The following commands are supported:\n" +
                "open <file> opens <file>\n" +
                "close closes currently opened file\n" +
                "save saves the currently open file\n" +
                "saveas <file> saves the currently open file in <file>\n" +
                "help prints this information\n" +
                "exit exists the program");
    }
}

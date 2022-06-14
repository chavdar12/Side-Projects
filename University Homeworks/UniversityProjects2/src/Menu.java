import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;

public class Menu {
    public static void main(String[] args) {
        var reader = new BufferedReader(new InputStreamReader(System.in));



        while (true) {

            try {
                var commands = reader.readLine().split("\\s+");

                switch (commands[0]) {
                    case "open":
                        break;
                    case "close":
                        break;
                    case "save":
                        break;
                    case "save as":
                        break;
                    case "exit":
                        exit(0);
                        break;
                    case "help":
                        printHelp();
                        break;
                    case "edit":
                        break;
                    case "print":
                        break;

                }
            } catch (IOException e) {
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
